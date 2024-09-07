package com.restaurants.api.restaurants_api

import com.restaurants.api.restaurants_api.dto.UpdateRestaurant
import com.restaurants.api.restaurants_api.entities.Restaurant
import com.restaurants.api.restaurants_api.services.RestaurantService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/restaurants")
public class RestaurantsController(@Autowired private val restaurantService: RestaurantService) {
  @GetMapping("")
  @ResponseBody
  fun getAll(): List<Restaurant> {
    return restaurantService.getAllRestaurants()
  }

  @PostMapping("")
  @ResponseBody
  fun createRestaurant(@RequestBody body: UpdateRestaurant): Restaurant {
    return restaurantService.createRestaurant(body)
  }
}