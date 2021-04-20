@file:Suppress("DEPRECATION")


package com.eremenko.splashscreen3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    Handler handler ;
    Runnable runnable;
    ImageView image;




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       image = findViewById(R.id.id_logo);
        image.animate().alpha(4000).setDuration(0);

        handler = new Handler();
        handler.postdelayed(new Runnable(){
            @Override
            public void run() {
                Intent dsp = new Intent(MainActivity,this,LoginActivity.class);
                startActivity(dsp);
                finish();
            }

        },delay )



    }
}