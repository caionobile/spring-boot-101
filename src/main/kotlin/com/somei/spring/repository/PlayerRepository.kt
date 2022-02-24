package com.somei.spring.repository

import com.somei.spring.domain.Player
import org.springframework.data.repository.CrudRepository

interface PlayerRepository : CrudRepository<Player, Long>
