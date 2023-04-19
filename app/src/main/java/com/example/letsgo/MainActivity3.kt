package com.example.letsgo

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    val btnt1=findViewById<ImageButton>(R.id.thirdp)
        btnt1.setOnClickListener(){
            startActivity(Intent( this,MainActivity2::class.java))
            finish()
        }
    }
}