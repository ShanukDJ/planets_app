package com.android.testapp

import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.viewModelScope
import com.android.testapp.network.RetroInstance
import com.android.testapp.network.RetroService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class PlanetsDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Planet Details"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        setContentView(R.layout.activity_planets_details)
        val bundle = intent.extras
        val planetDetailsPage = findViewById<TextView>(R.id.planetDetailsPageName)
        val climateDetailsPage = findViewById<TextView>(R.id.climateDetailsPage)
        val orbitalPeriod = findViewById<TextView>(R.id.orbitalperiod)

        planetDetailsPage.text = (bundle?.getString("name"))
        climateDetailsPage.text = (bundle?.getString("climate"))
        orbitalPeriod.text = (bundle?.getString("orbitalPeriod"))





    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}