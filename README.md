# valgdata-api

Spring-applikasjon som serverer valgdata. Applikasjonen tilbyr en rekke endepunkter. Hvert endepunkt er forbundet med en spesifikk fil i en GCP Bucket, som APIet serverer ved et kall. Disse filene produserer på dataplattformen i databricks. 

APIet er satt opp slik at requests må inneholde parameteret "organisasjon" for å bli behandlet. Dette er for at brukere at APIet skal identifisere seg selv.

## Oppsett

For å kjøre applikasjonen lokalt trenger du å opprette en run-configuration i Intellij som setter miljøvariableler for applikasjonen. 
Dette vil sørge for at applikasjonen vet hvilken gcp-bøtte den skal gå i mot, hvilke credentials den skal bruke for å få tilgang, og litt penere logger i konsollen:

Åpne prosjektet i Intellij.

Gå til Run -> Edit Configurations... fra toppmenyen. I dialogboksen Run/Debug Configurations, klikk på +-knappen eller velg typen "Spring".

Gi konfigurasjonen et navn (f.eks. ValgdataApplicationLocal). I seksjonen Environment variables, klikk på + for å legge til en ny miljøvariabel. Her trenger du tre:
* ENV = local
* GOOGLE_APPLICATION_CREDENTIALS_JSON = *Finnes på GCP (Må være JSON)*
* VALGDATA_BUCKET_NAME = dataprodukter-nibas-dev-075c

Sett java-version som termurin21, og modul lik valgdata.main. Sett class lik: "no.kartverket.valgdata.ValgdataApplication"

Trykk "Apply" og deretter "Ok"

## Tech stack

Applikasjonen er skrevet i Kotlin, og bruker Spring-boot som rammeverk. 
Google cloud biblioteket brukes from å kommunisere med gcp.

Konfigurasjon for kjøring på SKIP finnes i [smia-apps](https://github.com/kartverket/smia-apps)

## Testing 

Det er per nå ingen tester for APIet.
