package com.carriraelan.animecharactermaker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init
        val createCh : Button = findViewById(R.id.create_btn)

        /**
         * Open Redactor or Gallery
         * TODO Create Gallery
         */
        createCh.setOnClickListener {
            val myIntent = Intent(this, RedactorActivity::class.java)
            startActivity(myIntent)
        }

    }
}