package com.android.testapp.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetroInstance {

    companion object {

        val baseURL = "https://swapi.dev/api/"

        val baseURLForImages = "https://picsum.photos/"


        fun getRetroInstance() : Retrofit {


            return Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

        }

        fun getRetroInstanceForImages() : Retrofit {


            return Retrofit.Builder()
                .baseUrl(baseURLForImages)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

        }
    }
}