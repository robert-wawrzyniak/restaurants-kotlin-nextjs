package com.restaurants.api.restaurants_api.repositories

import com.restaurants.api.restaurants_api.entities.Restaurant
import org.springframework.data.repository.CrudRepository

interface RestaurantRepository : CrudRepository<Restaurant, Long>