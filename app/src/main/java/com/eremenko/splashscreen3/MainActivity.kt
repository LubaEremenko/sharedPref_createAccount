@file:Suppress("DEPRECATION")


package com.eremenko.splashscreen3

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sign_in.*
import kotlinx.android.synthetic.main.activity_sign_in.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create__accaunt)



    }



    /* override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_sign_in)

         login.setOnClickListener {
            var status = if(id_email.text.toString().equals("Mary@gmail.com")
                 &&password.text.toString().equals("111")) "Logged in successfully"
             else "Login Failed"
             Toast.makeText(this, status,Toast.LENGTH_LONG).show()

         }



     }*/
}