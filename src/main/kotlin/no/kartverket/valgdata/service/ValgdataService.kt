package no.kartverket.valgdata.service

import org.springframework.core.io.InputStreamResource
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class ValgdataService(
    val gcpService: GCPService
) {
    enum class Dataprodukt(val fileNameDagens: String, val fileNameFramtidig: String) {
        TELLEKRETSER(fileNameDagens = "dagens/stemmekretser/gold_tellekretser.geojson", fileNameFramtidig = ""),
        FYLKER(fileNameDagens = "", fileNameFramtidig = ""),
        KOMMUNER(fileNameDagens = "", fileNameFramtidig = "")
    }
    fun getTellekretser(framtidig: Boolean): ResponseEntity<InputStreamResource> {
        return if (framtidig) {
            gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.TELLEKRETSER.fileNameFramtidig)
        } else gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.TELLEKRETSER.fileNameDagens)
    }

    fun getFylker(framtidig: Boolean): ResponseEntity<InputStreamResource> {
        return if (framtidig) {
            gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.FYLKER.fileNameFramtidig)
        } else gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.FYLKER.fileNameDagens)
    }

    fun getKommuner(framtidig: Boolean): ResponseEntity<InputStreamResource> {
        return if (framtidig) {
            gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.KOMMUNER.fileNameFramtidig)
        } else gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.KOMMUNER.fileNameDagens)
    }
}