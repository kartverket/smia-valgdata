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

    override fun getTellekretserRepresentasjonspunkter(): ResponseEntity<InputStreamResource> {
        return valgdataService.getTellekretserRepresentasjonspunkter(framtidig = false)
    }

    override fun getFramtidigeTellekretser(): ResponseEntity<InputStreamResource> {
        return valgdataService.getTellekretser(framtidig = true)
    }

    override fun getFramtidigeTellekretserRepresentasjonspunkter(): ResponseEntity<InputStreamResource> {
        return valgdataService.getTellekretserRepresentasjonspunkter(framtidig = true)
    }

    override fun getFylker(): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylker(framtidig = false)
    }

    override fun getFylkerRepresentasjonspunkter(): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylkerRepresentasjonspunkter(framtidig = false)
    }

    override fun getFramtidigeFylker(): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylker(framtidig = true)
    }

    override fun getFramtidigeFylkerRepresentasjonspunkter(): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylkerRepresentasjonspunkter(framtidig = true)
    }

    override fun getKommuner(): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommuner(framtidig = false)
    }

    override fun getKommunerRepresentasjonspunkter(): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommunerRepresentasjonspunkter(framtidig = false)
    }

    override fun getFramtidigeKommuner(): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommuner(framtidig = true)
    }

    override fun getFramtidigeKommunerRepresentasjonspunkter(): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommunerRepresentasjonspunkter(framtidig = true)
    }


}