package com.eremenko.splashscreen3

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.ShareActionProvider
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_create__accaunt.*


class CreateAccaunt : AppCompatActivity() {

    //lateinit var sharedPreferences: SharedPreferences

    // var isRemembered = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create__accaunt)

        println("dlf")

        id_btnCreateNewAccount.setOnClickListener {
            println("dlf")
            Log.d("CreateAccaunt", "Password is:")




/*

            val intent = Intent(this, StationDetail::class.java)
        startActivity(intent)
*/


        /*sharedPreferences = getSharedPreferences("SHARED_PREFS", Context.MODE_PRIVATE)

           isRemembered = sharedPreferences.getBoolean("CHECKBOX", false)

           if (isRemembered) {

               val intent = Intent(this, StationDetail::class.java)
               startActivity(intent)
               finish()
           }*/


       // loadData()




           // saveData()


            /*val email: String =  id_email.text.toString()
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

            Toast.makeText(this, "Information saved!!!", Toast.LENGTH_LONG).show()

            val intent = Intent(this, StationDetail::class.java)
            startActivity(intent)
            finish()*/


            /* print("Email is:  + email")*/

            //did not show in logcat. WHy?
            /*   Log.d("CreateAccaunt", "Email is: " + email)
            Log.d("CreateAccaunt", "Password is: $pswd")
            Log.d("CreateAccaunt", "First name is: " + firstName)
            Log.d("CreateAccaunt", "Last name is: " + lastName)*/

           //onSave()



        }



        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.title = "Create Account"

            //back button
            actionBar.setDisplayHomeAsUpEnabled(true)

        }


    }

   /* private fun saveData() {
        val email: String = id_email.text.toString()
        val pswd: String = id_password.text.toString()
        val firstName: String = id_firstname.text.toString()
        val lastName: String = id_lastname.text.toString()

        val sharedPreferences: SharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.apply {
            putString("STRING_KEY", email)
            putString("STRING_KEY", pswd)
            putString("STRING_KEY", firstName)
            putString("STRING_KEY", lastName)

            putBoolean("BOOLEAN_KEY", checkBox.isChecked)


        }.apply()

        //made toast
        val toast = Toast.makeText(this, "Saved successfully", Toast.LENGTH_LONG)
        toast.setGravity(Gravity.TOP, 0, 140)
        toast.show()

    }


    private fun loadData() {
        val sharedPreferences: SharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        val savedString: String? = sharedPreferences.getString("STRING_KEY", null)
        val savedBoolean: Boolean = sharedPreferences.getBoolean("BOOLEAN_KEY", false)

        checkBox.isChecked = savedBoolean*/


 /*fun onSave() {
  //create  shared pref file
  val pref = getPreferences(Context.MODE_PRIVATE)
  val editor = pref.edit()

  //save email
  editor.putString("EMAIL" , id_email.text.toString())
  //save pswd
  editor.putString("PASSWORD" , id_password.text.toString())
  //save first name
  editor.putString("FIRST NAME" , id_firstname.text.toString())
  //save first name
  editor.putString("LAST NAME" , id_lastname.text.toString())
  //Commit changes
  editor.commit()

  //made toast
  val toast = Toast.makeText(applicationContext, "Saved successfully", Toast.LENGTH_LONG)
  toast.setGravity(Gravity.TOP, 0, 140)
  toast.show()
*/


    }
