package com.example.letsgo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btn =findViewById<Button>(R.id.button);

        btn.setOnClickListener(){
            val text=findViewById<EditText>(R.id.enrollment);
            val value=text.text.toString().trim();
            if(value.isEmpty()){
                Toast.makeText(this,"Please Enter Your Roll Number", Toast.LENGTH_SHORT).show()
            }
            else{
                Handler(Looper.getMainLooper()).postDelayed({
                    startActivity(Intent(this,MainActivity::class.java))
                    finish()
                },20)
            }
        }
    }


}