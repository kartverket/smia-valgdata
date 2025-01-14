import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.core.io.InputStreamResource
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/")
@Tag(
    name = "Valgdata API",
    description = "Endepunkter for å hente data om inndelinger som er relevante for valget. Her kan en hente data om tellekretser, kommuner, og fylker. Disse finnes både med og uten kystkontur. Representasjonspunkter serveres som egne filer. APIet skiller mellom dagens inndelinger og evt. fremtidige endringer på nevnte inndelinger. "
)

interface ValgdataApi {

    @Operation(summary = "Hent tellekretser", description = "Henter alle tellekretser")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("dagens/tellekretser", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getTellekretser(): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent tellekretser med kystkontur", description = "Henter alle tellekretser klippet etter kystkontur")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("dagens/tellekretser/kystkontur", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getTellekretserKystkontur(): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent dagens tellekretser representasjonspunkter", description = "Henter alle dagens tellekretser sine representasjonspunkter")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("dagens/tellekretser/representasjonspunkter", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getTellekretserRepresentasjonspunkter(): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent dagens tellekretser representasjonspunkter", description = "Henter alle dagens tellekretser klippet etter kystkontur sine representasjonspunkter")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("dagens/tellekretser/kystkontur/representasjonspunkter", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getTellekretserKystkonturRepresentasjonspunkter(): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent framtidige tellekretser", description = "Henter alle framtidige tellekretser")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("framtidige/tellekretser", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFramtidigeTellekretser(): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent framtidige tellekretser kystkontur", description = "Henter alle framtidige tellekretser klippet etter kystkontur")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("framtidige/tellekretser/kystkontur", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFramtidigeTellekretserKystkontur(): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent framtidige tellekretser representasjonspunkter", description = "Henter alle framtidige tellekretser sine representasjonspunkter")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("framtidige/tellekretser/representasjonspunkter", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFramtidigeTellekretserRepresentasjonspunkter(): ResponseEntity<InputStreamResource>

    @Operation(summary = "Hent framtidige tellekretser representasjonspunkter", description = "Henter alle framtidige tellekretser sine representasjonspunkter")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Successful operation",
            content = [Content(
                mediaType = "application/json",
            )]
        )
    )
    @GetMapping("framtidige/tellekretser/kystkontur/representasjonspunkter", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFramtidigeTellekretserKystkonturRepresentasjonspunkter(): ResponseEntity<InputStreamResource>

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
    fun getFylker(): ResponseEntity<InputStreamResource>

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
    fun getFylkerKystkontur(): ResponseEntity<InputStreamResource>

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
    fun getFylkerRepresentasjonspunkter(): ResponseEntity<InputStreamResource>

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
    fun getFylkerKystkonturRepresentasjonspunkter(): ResponseEntity<InputStreamResource>

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
    fun getFramtidigeFylker(): ResponseEntity<InputStreamResource>

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
    fun getFramtidigeFylkerKystkontur(): ResponseEntity<InputStreamResource>

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
    fun getFramtidigeFylkerRepresentasjonspunkter(): ResponseEntity<InputStreamResource>

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
    fun getFramtidigeFylkerKystkonturRepresentasjonspunkter(): ResponseEntity<InputStreamResource>

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
    fun getKommuner(): ResponseEntity<InputStreamResource>

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
    fun getKommunerKystkontur(): ResponseEntity<InputStreamResource>

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
    fun getKommunerRepresentasjonspunkter(): ResponseEntity<InputStreamResource>

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
    fun getKommunerKystkonturRepresentasjonspunkter(): ResponseEntity<InputStreamResource>

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
    fun getFramtidigeKommuner(): ResponseEntity<InputStreamResource>

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
    fun getFramtidigeKommunerKystkontur(): ResponseEntity<InputStreamResource>

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
    fun getFramtidigeKommunerRepresentasjonspunkter(): ResponseEntity<InputStreamResource>

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
    fun getFramtidigeKommunerKystkonturRepresentasjonspunkter(): ResponseEntity<InputStreamResource>
}