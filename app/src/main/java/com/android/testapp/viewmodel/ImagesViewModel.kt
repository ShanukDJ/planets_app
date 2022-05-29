package com.android.testapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.testapp.network.ImagesListModel
import com.android.testapp.network.RetroInstance
import com.android.testapp.network.RetroService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ImagesViewModel : ViewModel() {


    var imageLiveData: MutableLiveData<List<ImagesListModel>> = MutableLiveData()


    init {
        imageLiveData = MutableLiveData()
    }


    fun getImageObserver(): MutableLiveData<List<ImagesListModel>> {
        return imageLiveData
    }

    fun makeApiCallForImages() {
        viewModelScope.launch(Dispatchers.IO) {
            val retroInstance = RetroInstance.getRetroInstanceForImages().create(RetroService::class.java)
            val response  = retroInstance.getImagesListFromApi()
            imageLiveData.postValue(response)
        }
    }
}