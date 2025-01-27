package no.kartverket.valgdata.controller

import ValgdataApi
import no.kartverket.valgdata.service.ValgdataService
import org.springframework.core.io.InputStreamResource
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController("ValgdataController")
class ValgdataController(private val valgdataService: ValgdataService): ValgdataApi {
    override fun getTellekretser(identifikasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getTellekretser(framtidig = false)
    }

    override fun getTellekretserKystkontur(identifikasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getTellekretserKystkontur(framtidig = false)
    }

    override fun getTellekretserRepresentasjonspunkter(identifikasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getTellekretserRepresentasjonspunkter(framtidig = false)
    }

    override fun getTellekretserKystkonturRepresentasjonspunkter(identifikasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getTellekretserKystkonturRepresentasjonspunkter(framtidig = false)
    }

    override fun getFramtidigeTellekretser(identifikasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getTellekretser(framtidig = true)
    }

    override fun getFramtidigeTellekretserKystkontur(identifikasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getTellekretserKystkontur(framtidig = true)
    }

    override fun getFramtidigeTellekretserRepresentasjonspunkter(identifikasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getTellekretserRepresentasjonspunkter(framtidig = true)
    }

    override fun getFramtidigeTellekretserKystkonturRepresentasjonspunkter(identifikasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getTellekretserKystkonturRepresentasjonspunkter(framtidig = true)
    }

    override fun getFylker(identifikasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylker(framtidig = false)
    }

    override fun getFylkerKystkontur(identifikasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylkerKystkontur(framtidig = false)
    }

    override fun getFylkerRepresentasjonspunkter(identifikasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylkerRepresentasjonspunkter(framtidig = false)
    }

    override fun getFylkerKystkonturRepresentasjonspunkter(identifikasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylkerKystkonturRepresentasjonspunkter(framtidig = false)
    }

    override fun getFramtidigeFylker(identifikasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylker(framtidig = true)
    }

    override fun getFramtidigeFylkerKystkontur(identifikasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylkerKystkontur(framtidig = true)
    }

    override fun getFramtidigeFylkerRepresentasjonspunkter(identifikasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylkerRepresentasjonspunkter(framtidig = true)
    }

    override fun getFramtidigeFylkerKystkonturRepresentasjonspunkter(identifikasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylkerKystkonturRepresentasjonspunkter(framtidig = true)
    }

    override fun getKommuner(identifikasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommuner(framtidig = false)
    }

    override fun getKommunerKystkontur(identifikasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommunerKystkontur(framtidig = false)
    }

    override fun getKommunerRepresentasjonspunkter(identifikasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommunerRepresentasjonspunkter(framtidig = false)
    }

    override fun getKommunerKystkonturRepresentasjonspunkter(identifikasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommunerKystkonturRepresentasjonspunkter(framtidig = false)
    }

    override fun getFramtidigeKommuner(identifikasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommuner(framtidig = true)
    }

    override fun getFramtidigeKommunerKystkontur(identifikasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommunerKystkontur(framtidig = true)
    }

    override fun getFramtidigeKommunerRepresentasjonspunkter(identifikasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommunerRepresentasjonspunkter(framtidig = true)
    }

    override fun getFramtidigeKommunerKystkonturRepresentasjonspunkter(identifikasjon: String): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommunerKystkonturRepresentasjonspunkter(framtidig = true)
    }


}