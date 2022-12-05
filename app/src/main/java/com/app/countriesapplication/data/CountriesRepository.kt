package com.app.countriesapplication.data

import androidx.lifecycle.LiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.liveData
import com.app.countriesapplication.network.CountriesListApiService
import javax.inject.Inject


interface CountriesRepository {
    suspend fun getAllCountries(): LiveData<PagingData<Country>>
}

class NetworkCountriesRepository @Inject constructor(
    private val countriesApiService : CountriesListApiService
) : CountriesRepository {
    override suspend fun getAllCountries(): LiveData<PagingData<Country>> {
        return Pager(
            config = PagingConfig(pageSize = NETWORK_PAGE_SIZE, enablePlaceholders = false),
            pagingSourceFactory = { CountriesPagingSource(countriesApiService) }
        ).liveData
    }

    companion object {
        const val NETWORK_PAGE_SIZE = 30
    }
}