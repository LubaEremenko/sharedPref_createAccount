package com.eremenko.splashscreen3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.title = "Login"

            //back button
            actionBar.setDisplayHomeAsUpEnabled(true)

        }


    }
}