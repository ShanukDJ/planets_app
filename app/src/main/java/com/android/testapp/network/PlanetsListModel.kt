package com.android.testapp.network

import android.net.Uri
import com.google.gson.annotations.SerializedName
import java.net.URL


data class PlanetsListModel(val results: ArrayList<PlanetInfo>)

data class PlanetInfo(val name: String?, val climate: String?, val orbital_period: String?)

data class ImagesListModel(@SerializedName("url") val url: String?)

