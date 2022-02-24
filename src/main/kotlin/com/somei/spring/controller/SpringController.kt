package com.somei.spring.controller

import com.somei.spring.domain.Player
import com.somei.spring.repository.PlayerRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@RestController
class SpringController(
    private val playerRepository: PlayerRepository
) {
    @GetMapping("/")
    fun helloWorld(): Player = Player(
        id = 0L,
        name = "NEW Player",
        level = Random.nextLong()
    ).let { playerRepository.save(it) }

    @GetMapping("/list")
    fun list(): Array<Player> = playerRepository.findAll().toList().toTypedArray()
}
