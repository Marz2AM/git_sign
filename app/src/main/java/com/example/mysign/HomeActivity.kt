package com.example.mysign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val home_id = findViewById<TextView>(R.id.tv_homeid)


        if (intent.hasExtra("id_id")){
            home_id.text = intent.getStringExtra("id_id")
        }

    }
}