import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.core.io.InputStreamResource
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@RequestMapping("/")
@Tag(
    name = "Valgdata API",
    description = "Endepunkter for å hente data om inndelinger som er relevante for valget. Her kan en hente data om stemmekretser, kommuner, og fylker. Disse finnes både med og uten kystkontur. Representasjonspunkter serveres som egne filer. APIet skiller mellom dagens inndelinger og evt. fremtidige endringer på nevnte inndelinger. "
)

interface ValgdataApi {

    @Operation(summary = "Hent stemmekretser", description = "Henter alle stemmekretser")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("dagens/stemmekretser", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getStemmekretser(
        @Parameter(description = "Oppgi kun navn på organisasjonen eller bedriften du representerer. Ikke oppgi personlig informasjon, som ditt eget navn eller annen identifiserende informasjon. Er du en privatperson, oppgi \"Ikke oppgitt\". Feltet brukes kun av Kartverket til statistiske formål", required = true)
        @RequestParam(required = true, name = "organisasjon") organisasjon: String
    ): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent stemmekretser med kystkontur", description = "Henter alle stemmekretser klippet etter kystkontur")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("dagens/stemmekretser/kystkontur", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getStemmekretserKystkontur(
        @Parameter(description = "Oppgi kun navn på organisasjonen eller bedriften du representerer. Ikke oppgi personlig informasjon, som ditt eget navn eller annen identifiserende informasjon. Er du en privatperson, oppgi \"Ikke oppgitt\". Feltet brukes kun av Kartverket til statistiske formål", required = true)
        @RequestParam(required = true, name = "organisasjon") organisasjon: String
    ): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent dagens stemmekretser representasjonspunkter", description = "Henter alle dagens stemmekretser sine representasjonspunkter")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("dagens/stemmekretser/representasjonspunkter", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getStemmekretserRepresentasjonspunkter(
        @Parameter(description = "Oppgi kun navn på organisasjonen eller bedriften du representerer. Ikke oppgi personlig informasjon, som ditt eget navn eller annen identifiserende informasjon. Er du en privatperson, oppgi \"Ikke oppgitt\". Feltet brukes kun av Kartverket til statistiske formål", required = true)
        @RequestParam(required = true, name = "organisasjon") organisasjon: String
    ): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent dagens stemmekretser representasjonspunkter", description = "Henter alle dagens stemmekretser klippet etter kystkontur sine representasjonspunkter")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("dagens/stemmekretser/kystkontur/representasjonspunkter", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getStemmekretserKystkonturRepresentasjonspunkter(
        @Parameter(description = "Oppgi kun navn på organisasjonen eller bedriften du representerer. Ikke oppgi personlig informasjon, som ditt eget navn eller annen identifiserende informasjon. Er du en privatperson, oppgi \"Ikke oppgitt\". Feltet brukes kun av Kartverket til statistiske formål", required = true)
        @RequestParam(required = true, name = "organisasjon") organisasjon: String
    ): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent framtidige stemmekretser", description = "Henter alle framtidige stemmekretser")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("framtidige/stemmekretser", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFramtidigeStemmekretser(
        @Parameter(description = "Oppgi kun navn på organisasjonen eller bedriften du representerer. Ikke oppgi personlig informasjon, som ditt eget navn eller annen identifiserende informasjon. Er du en privatperson, oppgi \"Ikke oppgitt\". Feltet brukes kun av Kartverket til statistiske formål", required = true)
        @RequestParam(required = true, name = "organisasjon") organisasjon: String
    ): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent framtidige stemmekretser kystkontur", description = "Henter alle framtidige stemmekretser klippet etter kystkontur")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("framtidige/stemmekretser/kystkontur", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFramtidigeStemmekretserKystkontur(
        @Parameter(description = "Oppgi kun navn på organisasjonen eller bedriften du representerer. Ikke oppgi personlig informasjon, som ditt eget navn eller annen identifiserende informasjon. Er du en privatperson, oppgi \"Ikke oppgitt\". Feltet brukes kun av Kartverket til statistiske formål", required = true)
        @RequestParam(required = true, name = "organisasjon") organisasjon: String
    ): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent framtidige stemmekretser representasjonspunkter", description = "Henter alle framtidige stemmekretser sine representasjonspunkter")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("framtidige/stemmekretser/representasjonspunkter", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFramtidigeStemmekretserRepresentasjonspunkter(
        @Parameter(description = "Oppgi kun navn på organisasjonen eller bedriften du representerer. Ikke oppgi personlig informasjon, som ditt eget navn eller annen identifiserende informasjon. Er du en privatperson, oppgi \"Ikke oppgitt\". Feltet brukes kun av Kartverket til statistiske formål", required = true)
        @RequestParam(required = true, name = "organisasjon") organisasjon: String
    ): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent framtidige stemmekretser representasjonspunkter", description = "Henter alle framtidige stemmekretser sine representasjonspunkter")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("framtidige/stemmekretser/kystkontur/representasjonspunkter", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFramtidigeStemmekretserKystkonturRepresentasjonspunkter(
        @Parameter(description = "Oppgi kun navn på organisasjonen eller bedriften du representerer. Ikke oppgi personlig informasjon, som ditt eget navn eller annen identifiserende informasjon. Er du en privatperson, oppgi \"Ikke oppgitt\". Feltet brukes kun av Kartverket til statistiske formål", required = true)
        @RequestParam(required = true, name = "organisasjon") organisasjon: String
    ): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent fylker", description = "Henter alle fylker")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("dagens/fylker", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFylker(
        @Parameter(description = "Oppgi kun navn på organisasjonen eller bedriften du representerer. Ikke oppgi personlig informasjon, som ditt eget navn eller annen identifiserende informasjon. Er du en privatperson, oppgi \"Ikke oppgitt\". Feltet brukes kun av Kartverket til statistiske formål", required = true)
        @RequestParam(required = true, name = "organisasjon") organisasjon: String
    ): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent fylker kystkontur", description = "Henter alle fylker klippet etter kystkontur")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("dagens/fylker/kystkontur", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFylkerKystkontur(
        @Parameter(description = "Oppgi kun navn på organisasjonen eller bedriften du representerer. Ikke oppgi personlig informasjon, som ditt eget navn eller annen identifiserende informasjon. Er du en privatperson, oppgi \"Ikke oppgitt\". Feltet brukes kun av Kartverket til statistiske formål", required = true)
        @RequestParam(required = true, name = "organisasjon") organisasjon: String
    ): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent fylker representasjonspunkter", description = "Henter alle fylker sine representasjonspunkter")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("dagens/fylker/representasjonspunkter", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFylkerRepresentasjonspunkter(
        @Parameter(description = "Oppgi kun navn på organisasjonen eller bedriften du representerer. Ikke oppgi personlig informasjon, som ditt eget navn eller annen identifiserende informasjon. Er du en privatperson, oppgi \"Ikke oppgitt\". Feltet brukes kun av Kartverket til statistiske formål", required = true)
        @RequestParam(required = true, name = "organisasjon") organisasjon: String
    ): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent fylker representasjonspunkter kystkontur", description = "Henter alle fylker klippet etter kystkontur sine representasjonspunkter")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("dagens/fylker/kystkontur/representasjonspunkter", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFylkerKystkonturRepresentasjonspunkter(
        @Parameter(description = "Oppgi kun navn på organisasjonen eller bedriften du representerer. Ikke oppgi personlig informasjon, som ditt eget navn eller annen identifiserende informasjon. Er du en privatperson, oppgi \"Ikke oppgitt\". Feltet brukes kun av Kartverket til statistiske formål", required = true)
        @RequestParam(required = true, name = "organisasjon") organisasjon: String
    ): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent framtidige fylker", description = "Henter alle framtidige fylker")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("framtidige/fylker", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFramtidigeFylker(
        @Parameter(description = "Oppgi kun navn på organisasjonen eller bedriften du representerer. Ikke oppgi personlig informasjon, som ditt eget navn eller annen identifiserende informasjon. Er du en privatperson, oppgi \"Ikke oppgitt\". Feltet brukes kun av Kartverket til statistiske formål", required = true)
        @RequestParam(required = true, name = "organisasjon") organisasjon: String
    ): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent framtidige fylker kystkontur", description = "Henter alle framtidige fylker klippet etter kystkontur")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("framtidige/fylker/kystkontur", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFramtidigeFylkerKystkontur(
        @Parameter(description = "Oppgi kun navn på organisasjonen eller bedriften du representerer. Ikke oppgi personlig informasjon, som ditt eget navn eller annen identifiserende informasjon. Er du en privatperson, oppgi \"Ikke oppgitt\". Feltet brukes kun av Kartverket til statistiske formål", required = true)
        @RequestParam(required = true, name = "organisasjon") organisasjon: String
    ): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent framtidige fylker representasjonspunkter", description = "Henter alle framtidige fylker sine representasjonspunkter")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("framtidige/fylker/representasjonspunkter", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFramtidigeFylkerRepresentasjonspunkter(
        @Parameter(description = "Oppgi kun navn på organisasjonen eller bedriften du representerer. Ikke oppgi personlig informasjon, som ditt eget navn eller annen identifiserende informasjon. Er du en privatperson, oppgi \"Ikke oppgitt\". Feltet brukes kun av Kartverket til statistiske formål", required = true)
        @RequestParam(required = true, name = "organisasjon") organisasjon: String
    ): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent framtidige fylker kystkontur representasjonspunkter", description = "Henter alle framtidige fylker klippet etter kystkontur sine representasjonspunkter")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("framtidige/fylker/kystkontur/representasjonspunkter", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFramtidigeFylkerKystkonturRepresentasjonspunkter(
        @Parameter(description = "Oppgi kun navn på organisasjonen eller bedriften du representerer. Ikke oppgi personlig informasjon, som ditt eget navn eller annen identifiserende informasjon. Er du en privatperson, oppgi \"Ikke oppgitt\". Feltet brukes kun av Kartverket til statistiske formål", required = true)
        @RequestParam(required = true, name = "organisasjon") organisasjon: String
    ): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent kommuner", description = "Henter alle kommuner")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("dagens/kommuner", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getKommuner(
        @Parameter(description = "Oppgi kun navn på organisasjonen eller bedriften du representerer. Ikke oppgi personlig informasjon, som ditt eget navn eller annen identifiserende informasjon. Er du en privatperson, oppgi \"Ikke oppgitt\". Feltet brukes kun av Kartverket til statistiske formål", required = true)
        @RequestParam(required = true, name = "organisasjon") organisasjon: String
    ): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent kommuner kystkontur", description = "Henter alle kommuner klippet etter kystkontur")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("dagens/kommuner/kystkontur", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getKommunerKystkontur(
        @Parameter(description = "Oppgi kun navn på organisasjonen eller bedriften du representerer. Ikke oppgi personlig informasjon, som ditt eget navn eller annen identifiserende informasjon. Er du en privatperson, oppgi \"Ikke oppgitt\". Feltet brukes kun av Kartverket til statistiske formål", required = true)
        @RequestParam(required = true, name = "organisasjon") organisasjon: String
    ): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent kommuner representasjonspunkter", description = "Henter alle kommuner sine representasjonspunkter")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("dagens/kommuner/representasjonspunkter", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getKommunerRepresentasjonspunkter(
        @Parameter(description = "Oppgi kun navn på organisasjonen eller bedriften du representerer. Ikke oppgi personlig informasjon, som ditt eget navn eller annen identifiserende informasjon. Er du en privatperson, oppgi \"Ikke oppgitt\". Feltet brukes kun av Kartverket til statistiske formål", required = true)
        @RequestParam(required = true, name = "organisasjon") organisasjon: String
    ): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent kommuner kystkontur representasjonspunkter", description = "Henter alle kommuner klippet etter kystkontur sine representasjonspunkter")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("dagens/kommuner/kystkontur/representasjonspunkter", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getKommunerKystkonturRepresentasjonspunkter(
        @Parameter(description = "Oppgi kun navn på organisasjonen eller bedriften du representerer. Ikke oppgi personlig informasjon, som ditt eget navn eller annen identifiserende informasjon. Er du en privatperson, oppgi \"Ikke oppgitt\". Feltet brukes kun av Kartverket til statistiske formål", required = true)
        @RequestParam(required = true, name = "organisasjon") organisasjon: String
    ): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent framtidige kommuner", description = "Henter alle framtidige kommuner")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("framtidige/kommuner", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFramtidigeKommuner(
        @Parameter(description = "Oppgi kun navn på organisasjonen eller bedriften du representerer. Ikke oppgi personlig informasjon, som ditt eget navn eller annen identifiserende informasjon. Er du en privatperson, oppgi \"Ikke oppgitt\". Feltet brukes kun av Kartverket til statistiske formål", required = true)
        @RequestParam(required = true, name = "organisasjon") organisasjon: String
    ): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent framtidige kommuner kystkontur", description = "Henter alle framtidige kommuner klippet etter kystkontur")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("framtidige/kommuner/kystkontur", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFramtidigeKommunerKystkontur(
        @Parameter(description = "Oppgi kun navn på organisasjonen eller bedriften du representerer. Ikke oppgi personlig informasjon, som ditt eget navn eller annen identifiserende informasjon. Er du en privatperson, oppgi \"Ikke oppgitt\". Feltet brukes kun av Kartverket til statistiske formål", required = true)
        @RequestParam(required = true, name = "organisasjon") organisasjon: String
    ): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent framtidige kommuner", description = "Henter alle framtidige kommuner")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("framtidige/kommuner/representasjonspunkter", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFramtidigeKommunerRepresentasjonspunkter(
        @Parameter(description = "Oppgi kun navn på organisasjonen eller bedriften du representerer. Ikke oppgi personlig informasjon, som ditt eget navn eller annen identifiserende informasjon. Er du en privatperson, oppgi \"Ikke oppgitt\". Feltet brukes kun av Kartverket til statistiske formål", required = true)
        @RequestParam(required = true, name = "organisasjon") organisasjon: String
    ): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent framtidige kommuner kystkontur representasjonspunkter", description = "Henter alle framtidige kommuner klippet etter kystkontur sine representasjonspunkter")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("framtidige/kommuner/kystkontur/representasjonspunkter", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFramtidigeKommunerKystkonturRepresentasjonspunkter(
        @Parameter(description = "Oppgi kun navn på organisasjonen eller bedriften du representerer. Ikke oppgi personlig informasjon, som ditt eget navn eller annen identifiserende informasjon. Er du en privatperson, oppgi \"Ikke oppgitt\". Feltet brukes kun av Kartverket til statistiske formål", required = true)
        @RequestParam(required = true, name = "organisasjon") organisasjon: String
    ): ResponseEntity<InputStreamResource>
}