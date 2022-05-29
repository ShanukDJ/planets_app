package com.android.testapp.network
import android.view.View
import retrofit2.http.GET


interface RetroService {

    @GET("planets")
    suspend fun getPlanetsListFromApi(): PlanetsListModel


    @GET("v2/list?page=1&limit=10")
    suspend fun getImagesListFromApi(): ArrayList<ImagesListModel>

}