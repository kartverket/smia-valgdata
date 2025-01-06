package no.kartverket.valgdata.service

import org.springframework.core.io.InputStreamResource
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

enum class Dataprodukt(val fileNameDagens: String, val fileNameFramtidig: String) {
    TELLEKRETSER(
        fileNameDagens = "dagens/stemmekretser/gold_tellekretser.geojson",
        fileNameFramtidig = "framtidig/stemmekretser/gold_tellekretser.geojson"
    ),
    FYLKER(
        fileNameDagens = "dagens/fylker/gold_fylker.geojson",
        fileNameFramtidig = "framtidig/fylker/gold_fylker.geojson"
    ),
    KOMMUNER(
        fileNameDagens = "dagens/kommuner/gold_kommuner.geojson",
        fileNameFramtidig = "framtidig/kommuner/gold_kommuner.geojson"
    ),
    TELLEKRETSER_REPRESENTASJONSPUNKTER(
        fileNameDagens = "dagens/stemmekretser/gold_tellekretser_representasjonspunkter.geojson",
        fileNameFramtidig = "framtidig/stemmekretser/gold_tellekretser_representasjonspunkter.geojson"
    ),
    FYLKER_REPRESENTASJONSPUNKTER(
        fileNameDagens = "dagens/fylker/gold_fylker_representasjonspunkter.geojson",
        fileNameFramtidig = "framtidig/fylker/gold_fylker_representasjonspunkter.geojson"
    ),
    KOMMUNER_REPRESENTASJONSPUNKTER(
        fileNameDagens = "dagens/kommuner/gold_kommuner_representasjonspunkter.geojson",
        fileNameFramtidig = "framtidig/kommuner/gold_kommuner_representasjonspunkter.geojson"
    ),
}

@Service
class ValgdataService(
    val gcpService: GCPService
) {

    fun getTellekretser(framtidig: Boolean): ResponseEntity<InputStreamResource> {
        return if (framtidig) {
            gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.TELLEKRETSER.fileNameFramtidig)
        } else gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.TELLEKRETSER.fileNameDagens)
    }

    fun getTellekretserRepresentasjonspunkter(framtidig: Boolean): ResponseEntity<InputStreamResource> {
        return if(framtidig){
            gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.TELLEKRETSER_REPRESENTASJONSPUNKTER.fileNameFramtidig)
        } else gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.TELLEKRETSER_REPRESENTASJONSPUNKTER.fileNameDagens)
    }

    fun getFylker(framtidig: Boolean): ResponseEntity<InputStreamResource> {
        return if (framtidig) {
            gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.FYLKER.fileNameFramtidig)
        } else gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.FYLKER.fileNameDagens)
    }

    fun getFylkerRepresentasjonspunkter(framtidig: Boolean): ResponseEntity<InputStreamResource> {
        return if (framtidig){
            gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.FYLKER_REPRESENTASJONSPUNKTER.fileNameFramtidig)
        } else gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.FYLKER_REPRESENTASJONSPUNKTER.fileNameDagens)
    }

    fun getKommuner(framtidig: Boolean): ResponseEntity<InputStreamResource> {
        return if (framtidig) {
            gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.KOMMUNER.fileNameFramtidig)
        } else gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.KOMMUNER.fileNameDagens)
    }

    fun getKommunerRepresentasjonspunkter(framtidig: Boolean): ResponseEntity<InputStreamResource> {
        return if (framtidig) {
            gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.KOMMUNER_REPRESENTASJONSPUNKTER.fileNameFramtidig)
        } else gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.KOMMUNER_REPRESENTASJONSPUNKTER.fileNameDagens)
    }
}