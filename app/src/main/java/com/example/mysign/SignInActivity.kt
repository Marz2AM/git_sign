package com.example.mysign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val paTh1 = findViewById<EditText>(R.id.path_id)
        val paTh2 = findViewById<EditText>(R.id.path_pt)
        val loginBtn = findViewById<Button>(R.id.btn_login)
        val signBtn = findViewById<Button>(R.id.btn_sign)

        loginBtn.setOnClickListener {
            if(paTh1.text.isEmpty()){
                Toast.makeText(this,"아이디/비밀번호를 확인해주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (paTh2.text.isEmpty()){
                Toast.makeText(this,"아이디/비밀번호를 확인해주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }


            val intent = Intent(this@SignInActivity, HomeActivity::class.java)

            intent.putExtra("id_id", paTh1.text.toString())
            startActivity(intent)


        }

        signBtn.setOnClickListener {
            val intent2 = Intent(this@SignInActivity, SignUpActivity::class.java)
            startActivity(intent2)
        }




    }
}




