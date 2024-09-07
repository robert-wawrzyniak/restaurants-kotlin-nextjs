package com.restaurants.api.restaurants_api.services

import com.restaurants.api.restaurants_api.dto.UpdateRestaurant
import com.restaurants.api.restaurants_api.entities.Restaurant
import com.restaurants.api.restaurants_api.repositories.RestaurantRepository
import org.springframework.stereotype.Service;
import java.time.LocalDateTime

interface RestaurantService {
    fun getAllRestaurants(): List<Restaurant>
    fun createRestaurant(data: UpdateRestaurant): Restaurant
}

@Service
class RestaurantServiceImpl(private val restaurantRepository: RestaurantRepository) : RestaurantService {
    override fun getAllRestaurants(): List<Restaurant> {
        return restaurantRepository.findAll().toList()
    }

    override fun createRestaurant(data: UpdateRestaurant): Restaurant {
        return restaurantRepository.save(Restaurant(0, data.name, data.description, LocalDateTime.now(), null))
    }
}