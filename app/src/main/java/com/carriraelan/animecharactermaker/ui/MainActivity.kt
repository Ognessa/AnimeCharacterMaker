package com.carriraelan.animecharactermaker.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.carriraelan.animecharactermaker.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val createCh : Button = findViewById(R.id.create_btn)

        createCh.setOnClickListener {
            val myIntent = Intent(this, RedactorActivity::class.java)
            startActivity(myIntent)
        }

    }
}