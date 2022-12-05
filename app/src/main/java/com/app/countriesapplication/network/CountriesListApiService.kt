package com.app.countriesapplication.network


import com.app.countriesapplication.data.Country
import retrofit2.http.GET
import retrofit2.http.Query

interface CountriesListApiService {
    @GET("db25946fd77c5873b0303b858e861ce724e0dcd0/")
    suspend fun fetchCountriesList(
        @Query("page") page: Int,
        @Query("limit") size: Int
    ) : List<Country>
}