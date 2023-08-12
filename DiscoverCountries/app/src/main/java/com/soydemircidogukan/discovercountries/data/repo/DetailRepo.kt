package com.soydemircidogukan.discovercountries.data.repo

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.soydemircidogukan.discovercountries.data.model.CountryModel
import com.soydemircidogukan.discovercountries.data.room.CountryDao
import com.soydemircidogukan.discovercountries.data.room.CountryDb
import kotlinx.coroutines.launch

class DetailRepo:BaseRepo() {
    val countryDetailData = MutableLiveData<CountryModel>()

    fun getDataFromRoom(context: Context, id:Int){
        launch {
            val dao = CountryDb(context).countryDao()
            val getCountry = dao.getCountry(id)
            countryDetailData.value = getCountry
        }
    }
}