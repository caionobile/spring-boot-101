package com.somei.spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Starter

fun main(vararg args: String) {
    runApplication<Starter>(*args)
}
