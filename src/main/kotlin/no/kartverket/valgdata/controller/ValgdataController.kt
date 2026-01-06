package no.kartverket.valgdata.controller

import no.kartverket.valgdata.api.ValgdataApi
import no.kartverket.valgdata.service.ValgdataService
import org.springframework.core.io.InputStreamResource
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController("ValgdataController")
class ValgdataController(private val valgdataService: ValgdataService): ValgdataApi {

    override fun getStemmekretser(organisasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getStemmekretser(framtidig = false)
    }

    override fun getStemmekretserKystkontur(organisasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getStemmekretserKystkontur(framtidig = false)
    }

    override fun getStemmekretserRepresentasjonspunkter(organisasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getStemmekretserRepresentasjonspunkter(framtidig = false)
    }

    override fun getStemmekretserKystkonturRepresentasjonspunkter(organisasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getStemmekretserKystkonturRepresentasjonspunkter(framtidig = false)
    }

    override fun getFramtidigeStemmekretser(organisasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getStemmekretser(framtidig = true)
    }

    override fun getFramtidigeStemmekretserKystkontur(organisasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getStemmekretserKystkontur(framtidig = true)
    }

    override fun getFramtidigeStemmekretserRepresentasjonspunkter(organisasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getStemmekretserRepresentasjonspunkter(framtidig = true)
    }

    override fun getFramtidigeStemmekretserKystkonturRepresentasjonspunkter(organisasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getStemmekretserKystkonturRepresentasjonspunkter(framtidig = true)
    }

    override fun getFylker(organisasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylker(framtidig = false)
    }

    override fun getFylkerKystkontur(organisasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylkerKystkontur(framtidig = false)
    }

    override fun getFylkerRepresentasjonspunkter(organisasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylkerRepresentasjonspunkter(framtidig = false)
    }

    override fun getFylkerKystkonturRepresentasjonspunkter(organisasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylkerKystkonturRepresentasjonspunkter(framtidig = false)
    }

    override fun getFramtidigeFylker(organisasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylker(framtidig = true)
    }

    override fun getFramtidigeFylkerKystkontur(organisasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylkerKystkontur(framtidig = true)
    }

    override fun getFramtidigeFylkerRepresentasjonspunkter(organisasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylkerRepresentasjonspunkter(framtidig = true)
    }

    override fun getFramtidigeFylkerKystkonturRepresentasjonspunkter(organisasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylkerKystkonturRepresentasjonspunkter(framtidig = true)
    }

    override fun getKommuner(organisasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommuner(framtidig = false)
    }

    override fun getKommunerKystkontur(organisasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommunerKystkontur(framtidig = false)
    }

    override fun getKommunerRepresentasjonspunkter(organisasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommunerRepresentasjonspunkter(framtidig = false)
    }

    override fun getKommunerKystkonturRepresentasjonspunkter(organisasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommunerKystkonturRepresentasjonspunkter(framtidig = false)
    }

    override fun getFramtidigeKommuner(organisasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommuner(framtidig = true)
    }

    override fun getFramtidigeKommunerKystkontur(organisasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommunerKystkontur(framtidig = true)
    }

    override fun getFramtidigeKommunerRepresentasjonspunkter(organisasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommunerRepresentasjonspunkter(framtidig = true)
    }

    override fun getFramtidigeKommunerKystkonturRepresentasjonspunkter(organisasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommunerKystkonturRepresentasjonspunkter(framtidig = true)
    }


}
