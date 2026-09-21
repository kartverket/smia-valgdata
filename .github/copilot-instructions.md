# Copilot instructions

## Build and test

- Use Java 21; the Gradle toolchain and CI are pinned to that version.
- Build and run all tests with:
  ```bash
  ./gradlew build
  ```
- Run the test task without assembling the application:
  ```bash
  ./gradlew test
  ```
- Run the existing Spring context test alone with:
  ```bash
  ./gradlew test --tests no.kartverket.valgdata.ValgdataApplicationTests
  ```
- No lint or formatting task is configured in `build.gradle.kts`.
- Start locally with `./gradlew bootRun`. Google Cloud Storage calls require
  `GOOGLE_APPLICATION_CREDENTIALS_JSON` and `VALGDATA_BUCKET_NAME`; `ENV=local` selects the
  human-readable console logger. Do not commit credential values.
- The application is served at `http://localhost:8080/valgdata/v1`; Swagger UI is at that context
  root. Management endpoints run on port 8081 and expose `health` and `prometheus`.

## Architecture

- `ValgdataApplication.kt` starts the Kotlin/Spring Boot application. `application.yml` supplies
  the `/valgdata/v1` servlet context path.
- `api/ValgdataApi.kt` is the public API contract: it contains Spring mappings and Springdoc
  annotations. `ValgdataController.kt` implements that interface and delegates every request to
  `ValgdataService.kt`.
- `ValgdataService.kt` maps each endpoint to a `Dataprodukt` enum entry, which provides distinct
  GCS paths for `dagens` and `framtidig` data. It passes the selected path to `GCPService.kt`.
- `GCPService.kt` builds a GCS client from `GOOGLE_APPLICATION_CREDENTIALS_JSON`, reads the bucket
  named by `VALGDATA_BUCKET_NAME`, and streams the GeoJSON object as a download response.
- The data files are produced outside this repository by the data platform. This application
  exposes existing bucket objects; it does not transform their GeoJSON payloads.

## Repository conventions

- Keep `ValgdataApi`, `ValgdataController`, and `ValgdataService` synchronized when adding or
  changing an endpoint. New datasets require corresponding `Dataprodukt` entries and both current
  and future bucket paths where applicable.
- Preserve public route names, the required `organisasjon` query parameter, Norwegian OpenAPI
  descriptions, `application/json` response type, and the `/valgdata/v1` base path unless the API
  change is intentional.
- Treat `Dataprodukt` paths as the contract with the upstream data platform. Preserve distinctions
  between `dagens`/`framtidig`, standard/kystkontur, and polygon/representasjonspunkter datasets.
- Controllers only coordinate HTTP requests; GCS authentication, object lookup, and response
  streaming stay in `GCPService`.
- `GCPService` currently maps any exception during object retrieval to an HTTP 404 response.
  Changes to storage error handling should distinguish expected missing objects from credential,
  configuration, or transport failures rather than exposing credentials in responses or logs.
