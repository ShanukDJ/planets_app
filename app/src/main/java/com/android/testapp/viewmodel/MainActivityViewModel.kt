package com.android.testapp.viewmodel
import android.graphics.BitmapFactory
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.testapp.network.ImagesListModel
import com.android.testapp.network.PlanetsListModel
import com.android.testapp.network.RetroInstance
import com.android.testapp.network.RetroService

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainActivityViewModel : ViewModel() {


     var planetsLiveData: MutableLiveData<PlanetsListModel> = MutableLiveData()

    fun getPlanetsListObserver(): MutableLiveData<PlanetsListModel> {

        return planetsLiveData
    }

    fun makeApiCall() {

        viewModelScope.launch(Dispatchers.IO) {

            val retroInstance = RetroInstance.getRetroInstance().create(RetroService::class.java)
            val response = retroInstance.getPlanetsListFromApi()
            planetsLiveData.postValue(response)

        }

    }

}

