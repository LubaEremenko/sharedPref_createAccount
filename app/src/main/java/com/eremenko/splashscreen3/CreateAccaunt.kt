package com.eremenko.splashscreen3

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_create__accaunt.*


class CreateAccaunt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create__accaunt)


        this.id_btnCreateNewAccount.setOnClickListener{
            val email = id_email.text.toString()
            val pswd = id_password.text.toString()
            val firstName = id_firstname.text.toString()
            val lastName = id_lastname.text.toString()

            print("Email is:  + email")

            //did not show in logcat. WHy?
            Log.d("CreateAccaunt", "Email is: " + email)
            Log.d("CreateAccaunt", "Password is: $pswd")
            Log.d("CreateAccaunt", "First name is: " + firstName)
            Log.d("CreateAccaunt", "Last name is: " + lastName)



        }

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.title = "Create Account"

            //back button
            actionBar.setDisplayHomeAsUpEnabled(true)

        }


    }
}