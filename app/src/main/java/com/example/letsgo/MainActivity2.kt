package com.example.letsgo

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btns1=findViewById<ImageButton>(R.id.secondn)
        val btns2=findViewById<ImageButton>(R.id.secondp)
        btns1.setOnClickListener(){
            startActivity(Intent(this,MainActivity3::class.java))
            finish()
        }
        btns2.setOnClickListener(){
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}