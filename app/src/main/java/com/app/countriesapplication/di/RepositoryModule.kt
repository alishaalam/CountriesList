package com.app.countriesapplication.di

import com.app.countriesapplication.data.CountriesRepository
import com.app.countriesapplication.data.NetworkCountriesRepository
import com.app.countriesapplication.network.CountriesListApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
// Repositories will live same as the activity that requires them
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    fun providesCountryRepository(countriesListApiService: CountriesListApiService): CountriesRepository {
        return NetworkCountriesRepository(countriesListApiService)
    }
}