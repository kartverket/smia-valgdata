package no.kartverket.valgdata

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ValgdataApplication

fun main(args: Array<String>) {
    runApplication<ValgdataApplication>(*args)
}
