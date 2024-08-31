package com.restaurants.api.restaurants_api.entities

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "Restaurants")
data class Restaurant(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    val description: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime?);