package com.example.mysign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val sign_name = findViewById<EditText>(R.id.sign_name)
        val sign_id = findViewById<EditText>(R.id.sign_id)
        val sign_pw = findViewById<EditText>(R.id.sign_pw)
        val signup_btn = findViewById<Button>(R.id.btn_signup)

        signup_btn.setOnClickListener {
            if (sign_name.text.isEmpty()){
                Toast.makeText(this,"입력되지 않은 정보가 있습니다", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (sign_id.text.isEmpty()){
                Toast.makeText(this,"입력되지 않은 정보가 있습니다", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (sign_pw.text.isEmpty()){
                Toast.makeText(this,"입력되지 않은 정보가 있습니다", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val intent = Intent(this@SignUpActivity, SignInActivity::class.java)
            finish()


        }

    }
}