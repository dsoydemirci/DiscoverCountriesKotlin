package com.soydemircidogukan.discovercountries.data.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import com.soydemircidogukan.discovercountries.data.repo.DetailRepo

class DetailVM: ViewModel() {

    val detailRepo = DetailRepo()

    fun getData(context: Context, id:Int){
        detailRepo.getDataFromRoom(context,id)
    }
}