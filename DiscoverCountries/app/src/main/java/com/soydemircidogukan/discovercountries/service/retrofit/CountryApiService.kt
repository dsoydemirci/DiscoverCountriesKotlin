package com.soydemircidogukan.discovercountries.service.retrofit

import com.soydemircidogukan.discovercountries.constants.Constants
import com.soydemircidogukan.discovercountries.data.model.CountryModel
import com.soydemircidogukan.discovercountries.service.api.CountryApi
import io.reactivex.rxjava3.core.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class CountryApiService {

    companion object{
        val retrofit = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()
            .create(CountryApi::class.java)
    }

    fun getData():Single<List<CountryModel>>{
        return retrofit.getCountries()
    }
}