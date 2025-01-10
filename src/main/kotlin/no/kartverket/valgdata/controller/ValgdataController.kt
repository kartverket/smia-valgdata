package no.kartverket.valgdata.controller

import ValgdataApi
import no.kartverket.valgdata.service.ValgdataService
import org.springframework.core.io.InputStreamResource
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController("ValgdataController")
class ValgdataController(private val valgdataService: ValgdataService): ValgdataApi {
    override fun getTellekretser(): ResponseEntity<InputStreamResource> {
        return valgdataService.getTellekretser(framtidig = false)
    }

    override fun getTellekretserKystkontur(): ResponseEntity<InputStreamResource> {
        return valgdataService.getTellekretserKystkontur(framtidig = false)
    }

    override fun getTellekretserRepresentasjonspunkter(): ResponseEntity<InputStreamResource> {
        return valgdataService.getTellekretserRepresentasjonspunkter(framtidig = false)
    }

    override fun getTellekretserKystkonturRepresentasjonspunkter(): ResponseEntity<InputStreamResource> {
        return valgdataService.getTellekretserKystkonturRepresentasjonspunkter(framtidig = false)
    }

    override fun getFramtidigeTellekretser(): ResponseEntity<InputStreamResource> {
        return valgdataService.getTellekretser(framtidig = true)
    }

    override fun getFramtidigeTellekretserKystkontur(): ResponseEntity<InputStreamResource> {
        return valgdataService.getTellekretserKystkontur(framtidig = true)
    }

    override fun getFramtidigeTellekretserRepresentasjonspunkter(): ResponseEntity<InputStreamResource> {
        return valgdataService.getTellekretserRepresentasjonspunkter(framtidig = true)
    }

    override fun getFramtidigeTellekretserKystkonturRepresentasjonspunkter(): ResponseEntity<InputStreamResource> {
        return valgdataService.getTellekretserKystkonturRepresentasjonspunkter(framtidig = true)
    }

    override fun getFylker(): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylker(framtidig = false)
    }

    override fun getFylkerKystkontur(): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylkerKystkontur(framtidig = false)
    }

    override fun getFylkerRepresentasjonspunkter(): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylkerRepresentasjonspunkter(framtidig = false)
    }

    override fun getFylkerKystkonturRepresentasjonspunkter(): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylkerKystkonturRepresentasjonspunkter(framtidig = false)
    }

    override fun getFramtidigeFylker(): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylker(framtidig = true)
    }

    override fun getFramtidigeFylkerKystkontur(): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylkerKystkontur(framtidig = true)
    }

    override fun getFramtidigeFylkerRepresentasjonspunkter(): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylkerRepresentasjonspunkter(framtidig = true)
    }

    override fun getFramtidigeFylkerKystkonturRepresentasjonspunkter(): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylkerKystkonturRepresentasjonspunkter(framtidig = true)
    }

    override fun getKommuner(): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommuner(framtidig = false)
    }

    override fun getKommunerKystkontur(): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommunerKystkontur(framtidig = false)
    }

    override fun getKommunerRepresentasjonspunkter(): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommunerRepresentasjonspunkter(framtidig = false)
    }

    override fun getKommunerKystkonturRepresentasjonspunkter(): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommunerKystkonturRepresentasjonspunkter(framtidig = false)
    }

    override fun getFramtidigeKommuner(): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommuner(framtidig = true)
    }

    override fun getFramtidigeKommunerKystkontur(): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommunerKystkontur(framtidig = true)
    }

    override fun getFramtidigeKommunerRepresentasjonspunkter(): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommunerRepresentasjonspunkter(framtidig = true)
    }

    override fun getFramtidigeKommunerKystkonturRepresentasjonspunkter(): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommunerKystkonturRepresentasjonspunkter(framtidig = true)
    }


}