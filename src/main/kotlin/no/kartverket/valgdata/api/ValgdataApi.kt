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
    description = "Endepunkter for å hente data om inndelinger som er relevante for valget"
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
    @GetMapping("/tellekretser", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getTellekretser(): ResponseEntity<InputStreamResource>

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
    @GetMapping("/tellekretser/framtidige", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFramtidigeTellekretser(): ResponseEntity<InputStreamResource>

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
    @GetMapping("/fylker", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFylker(): ResponseEntity<InputStreamResource>

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
    @GetMapping("/fylker/framtidige", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFramtidigeFylker(): ResponseEntity<InputStreamResource>

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
    @GetMapping("/kommuner", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getKommuner(): ResponseEntity<InputStreamResource>

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
    @GetMapping("/kommuner/framtidige", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFramtidigeKommuner(): ResponseEntity<InputStreamResource>
}