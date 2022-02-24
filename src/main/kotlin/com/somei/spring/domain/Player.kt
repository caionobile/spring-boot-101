package com.somei.spring.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table
data class Player(
    @Id
    val id: Long,
    val name: String,
    val level: Long
)
