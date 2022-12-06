package com.app.countriesapplication.data

import android.util.Log
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

//Darryl : Outside

class NetworkCountriesRepository @Inject constructor(
    private val countriesApiService : CountriesListApiService
) : CountriesRepository {
     override suspend fun getAllCountries(): LiveData<PagingData<Country>> {
         val pagingSourceFactory = { CountriesPagingSource(countriesApiService) }
         Log.d(TAG, " In getAllCountries()")
        return Pager(
            config = PagingConfig(pageSize = 30, enablePlaceholders = false),
            pagingSourceFactory =  pagingSourceFactory
        ).liveData
    }

    companion object {
        private val TAG = NetworkCountriesRepository::class.qualifiedName
    }
}