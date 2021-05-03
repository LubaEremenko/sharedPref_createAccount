package com.eremenko.splashscreen3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_splash__screen2.*

class Splash_Screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash__screen2)



        id_btnLogIn.setOnClickListener {
          Log.d("Splash_Screen2", "Try login")
            // launch the login activity
            val intent = Intent(this, Login::class.java)
                startActivity(intent)

        }

        btnCreateAccaunt.setOnClickListener {
            Log.d("Splash_Screen2", "Try create")
            // launch the create account activity
            val intent = Intent(this, CreateAccaunt::class.java)
            startActivity(intent)

        }

        }







    }





