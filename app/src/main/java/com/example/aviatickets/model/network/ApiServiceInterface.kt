package com.example.aviatickets.model.network

import com.example.aviatickets.model.entity.Offer
import retrofit2.Call
import retrofit2.http.GET



interface ApiServiceInterface {
    @GET("fake-api-demo/offer_list")
    fun getFlights(): Call<List<Offer>>
}