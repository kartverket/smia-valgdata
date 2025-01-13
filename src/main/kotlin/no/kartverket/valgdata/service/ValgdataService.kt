package no.kartverket.valgdata.service

import org.springframework.core.io.InputStreamResource
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

enum class Dataprodukt(val fileNameDagens: String, val fileNameFramtidig: String) {
    TELLEKRETSER(
        fileNameDagens = "dagens/stemmekretser/gold_tellekretser.geojson",
        fileNameFramtidig = "framtidig/stemmekretser/gold_tellekretser.geojson"
    ),
    TELLEKRETSER_KYSTKONTUR(
        fileNameDagens = "dagens/stemmekretser/gold_tellekretser_kystkontur.geojson",
        fileNameFramtidig = "framtidig/stemmekretser/gold_tellekretser_kystkontur.geojson"
    ),
    FYLKER(
        fileNameDagens = "dagens/fylker/gold_fylker.geojson",
        fileNameFramtidig = "framtidig/fylker/gold_fylker.geojson"
    ),
    FYLKER_KYSTKONTUR(
        fileNameDagens = "dagens/fylker/gold_fylker_kystkontur.geojson",
        fileNameFramtidig = "framtidig/fylker/gold_fylker_kystkontur.geojson"
    ),
    KOMMUNER(
        fileNameDagens = "dagens/kommuner/gold_kommuner.geojson",
        fileNameFramtidig = "framtidig/kommuner/gold_kommuner.geojson"
    ),
    KOMMUNER_KYSTKONTUR(
        fileNameDagens = "dagens/kommuner/gold_kommuner_kystkontur.geojson",
        fileNameFramtidig = "framtidig/kommuner/gold_kommuner_kystkontur.geojson"
    ),
    TELLEKRETSER_REPRESENTASJONSPUNKTER(
        fileNameDagens = "dagens/stemmekretser/gold_tellekretser_representasjonspunkter.geojson",
        fileNameFramtidig = "framtidig/stemmekretser/gold_tellekretser_representasjonspunkter.geojson"
    ),
    TELLEKRETSER_KYSTKONTUR_REPRESENTASJONSPUNKTER(
        fileNameDagens = "dagens/stemmekretser/gold_tellekretser_kystkontur_representasjonspunkter.geojson",
        fileNameFramtidig = "framtidig/stemmekretser/gold_tellekretser_kystkontur_representasjonspunkter.geojson"
    ),
    FYLKER_REPRESENTASJONSPUNKTER(
        fileNameDagens = "dagens/fylker/gold_fylker_representasjonspunkter.geojson",
        fileNameFramtidig = "framtidig/fylker/gold_fylker_representasjonspunkter.geojson"
    ),
    FYLKER_KYSTKONTUR_REPRESENTASJONSPUNKTER(
        fileNameDagens = "dagens/fylker/gold_fylker_kystkontur_representasjonspunkter.geojson",
        fileNameFramtidig = "framtidig/fylker/gold_fylker_kystkontur_representasjonspunkter.geojson"
    ),
    KOMMUNER_REPRESENTASJONSPUNKTER(
        fileNameDagens = "dagens/kommuner/gold_kommuner_representasjonspunkter.geojson",
        fileNameFramtidig = "framtidig/kommuner/gold_kommuner_representasjonspunkter.geojson"
    ),
    KOMMUNER_KYSTKONTUR_REPRESENTASJONSPUNKTER(
        fileNameDagens = "dagens/kommuner/gold_kommuner_kystkontur_representasjonspunkter.geojson",
        fileNameFramtidig = "framtidig/kommuner/gold_kommuner_kystkontur_representasjonspunkter.geojson"
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

    fun getTellekretserKystkontur(framtidig: Boolean): ResponseEntity<InputStreamResource> {
        return if (framtidig) {
            gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.TELLEKRETSER_KYSTKONTUR.fileNameFramtidig)
        } else gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.TELLEKRETSER_KYSTKONTUR.fileNameDagens)
    }

    fun getTellekretserKystkonturRepresentasjonspunkter(framtidig: Boolean): ResponseEntity<InputStreamResource> {
        return if(framtidig){
            gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.TELLEKRETSER_KYSTKONTUR_REPRESENTASJONSPUNKTER.fileNameFramtidig)
        } else gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.TELLEKRETSER_KYSTKONTUR_REPRESENTASJONSPUNKTER.fileNameDagens)
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

    fun getFylkerKystkontur(framtidig: Boolean): ResponseEntity<InputStreamResource> {
        return if (framtidig) {
            gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.FYLKER_KYSTKONTUR.fileNameFramtidig)
        } else gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.FYLKER_KYSTKONTUR.fileNameDagens)
    }

    fun getFylkerKystkonturRepresentasjonspunkter(framtidig: Boolean): ResponseEntity<InputStreamResource> {
        return if (framtidig){
            gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.FYLKER_KYSTKONTUR_REPRESENTASJONSPUNKTER.fileNameFramtidig)
        } else gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.FYLKER_KYSTKONTUR_REPRESENTASJONSPUNKTER.fileNameDagens)
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

    fun getKommunerKystkontur(framtidig: Boolean): ResponseEntity<InputStreamResource> {
        return if (framtidig) {
            gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.KOMMUNER_KYSTKONTUR.fileNameFramtidig)
        } else gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.KOMMUNER_KYSTKONTUR.fileNameDagens)
    }

    fun getKommunerKystkonturRepresentasjonspunkter(framtidig: Boolean): ResponseEntity<InputStreamResource> {
        return if (framtidig) {
            gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.KOMMUNER_KYSTKONTUR_REPRESENTASJONSPUNKTER.fileNameFramtidig)
        } else gcpService.getGeoJsonFromDataprodukterBucket(Dataprodukt.KOMMUNER_KYSTKONTUR_REPRESENTASJONSPUNKTER.fileNameDagens)
    }
}