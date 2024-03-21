package com.example.mysign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Random

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val home_id = findViewById<TextView>(R.id.tv_homeid)
        val homebtn = findViewById<Button>(R.id.home_btn)




        if (intent.hasExtra("id_id")){
            home_id.text = intent.getStringExtra("id_id")
        }
        homebtn.setOnClickListener {
            val intent = Intent(this@HomeActivity, SignInActivity::class.java)
            finish()
        }




    }
}