@file:Suppress("DEPRECATION")


package com.eremenko.splashscreen3

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_create__accaunt.*
import kotlinx.android.synthetic.main.activity_sign_in.*
import kotlinx.android.synthetic.main.activity_sign_in.*
import kotlinx.android.synthetic.main.activity_sign_in.id_email

class MainActivity : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences

   var isRemembered = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create__accaunt)

        sharedPreferences = getSharedPreferences("SHARED_PREFS", Context.MODE_PRIVATE)

        isRemembered = sharedPreferences.getBoolean("CHECKBOX", false)

        if (!isRemembered) {

            println(sharedPreferences.getString("EMAIL", "DEFAULT"))


            val intent = Intent(this, StationDetail::class.java)
            startActivity(intent)
            finish()
        }

        id_btnCreateNewAccount.setOnClickListener {



            val email: String =  id_email.text.toString()
            val pswd: String = id_password.text.toString()
            val firstName: String = id_firstname.text.toString()
            val lastName: String  = id_lastname.text.toString()

            val checkBox: Boolean = checkBox.isChecked

            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("EMAIL", email)
            editor.putString("PASSWORD", pswd)
            editor.putString("FIRST_NAME", firstName)
            editor.putString("LAST_NAME", lastName)
            editor.putBoolean("CHECKBOX", checkBox)
            editor.apply()

            val toast = Toast.makeText(this, "Saved successfully", Toast.LENGTH_LONG)
            toast.setGravity(Gravity.TOP, 0, 140)
            toast.show()

            println(sharedPreferences.getString("EMAIL", "DEFAULT"))

        }



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