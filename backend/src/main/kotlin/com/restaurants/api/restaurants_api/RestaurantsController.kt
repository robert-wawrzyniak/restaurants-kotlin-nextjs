package com.restaurants.api.restaurants_api

import com.restaurants.api.restaurants_api.dto.UpdateRestaurant
import com.restaurants.api.restaurants_api.entities.Restaurant
import com.restaurants.api.restaurants_api.repositories.RestaurantRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime

@Controller
@RequestMapping("/restaurants")
public class RestaurantsController(@Autowired private val restaurantRepository: RestaurantRepository) {
  @GetMapping("")
  @ResponseBody
  fun getAll(): List<Restaurant> {
    return restaurantRepository.findAll().toList()
  }

  @PostMapping("")
  @ResponseBody
  fun createRestaurant(@RequestBody body: UpdateRestaurant): Restaurant {
    return restaurantRepository.save(Restaurant(0, body.name, body.description, LocalDateTime.now(), null))
  }
}