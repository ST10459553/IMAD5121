package com.example.dogswitcher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnActivity1=findViewById<Button>(R.id.btnActivity1)
        btnActivity1.setOnClickListener {
            val intent=Intent(this, MainActivity2::class.java)
        startActivity(intent)}

        val btnActivity2=findViewById<Button>(R.id.btnActivity2)
        btnActivity2.setOnClickListener {
            val intent=Intent(this, MainActivity3::class.java)
            startActivity(intent)

        }
    }
}