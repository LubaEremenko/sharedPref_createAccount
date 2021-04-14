package com.eremenko.splashscreen3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class StationDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_station_detail)

        val stationCity = intent.getStringExtra(CustomViewHolder.CITY_KEY)
        val stationAddress = intent.getStringExtra(CustomViewHolder.ADDRESS_KEY)
        val aBikeStation = intent.getStringExtra(CustomViewHolder.ABIKESTAND)
        val aBike = intent.getStringExtra(CustomViewHolder.ABIKE)

        println(stationAddress + aBikeStation + aBike)

        val city = findViewById<TextView>(R.id.stationContry)
        val address = findViewById<TextView>(R.id.station_address)
        val availableBikestand = findViewById<TextView>(R.id.station_aBikeStand)
        val availableBike = findViewById<TextView>(R.id.station_aBike)

        city.text = stationCity
        address.text = stationAddress
        availableBikestand.text = aBikeStation
        availableBike.text = aBike

    }
}