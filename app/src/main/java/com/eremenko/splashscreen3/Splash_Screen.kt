package com.eremenko.splashscreen3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash_Screen : AppCompatActivity() {
    private  val SPLASH_TIME: Long = 3000

    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash__screen)
        handler = Handler()
        handler.postDelayed({
            startActivity(Intent(this, MainActivity::class.java ))
            finish()
        } , SPLASH_TIME)


    }
}