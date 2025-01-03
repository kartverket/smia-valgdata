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

    override fun getFramtidigeTellekretser(): ResponseEntity<InputStreamResource> {
        return valgdataService.getTellekretser(framtidig = true)
    }

    override fun getFylker(): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylker(framtidig = false)
    }

    override fun getFramtidigeFylker(): ResponseEntity<InputStreamResource> {
        return valgdataService.getFylker(framtidig = true)
    }

    override fun getKommuner(): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommuner(framtidig = false)
    }

    override fun getFramtidigeKommuner(): ResponseEntity<InputStreamResource> {
        return valgdataService.getKommuner(framtidig = true)
    }


}