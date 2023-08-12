package com.soydemircidogukan.discovercountries.service.api

import com.soydemircidogukan.discovercountries.constants.Constants
import com.soydemircidogukan.discovercountries.data.model.CountryModel
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface CountryApi {

    @GET(Constants.GET_COUNTRY_URL)
    fun getCountries() : Single<List<CountryModel>>
}