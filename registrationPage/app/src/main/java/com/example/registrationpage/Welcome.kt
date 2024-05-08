package com.example.registrationpage

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val nameTv=findViewById<TextView>(R.id.nameTv)
        val surnameTv=findViewById<TextView>(R.id.surnameTv)
        val emailTv=findViewById<TextView>(R.id.emailTv)

        nameTv.text=intent.getStringExtra("EXTRA_NAME")
        surnameTv.text=intent.getStringExtra("EXTRA_SURNAME")
        emailTv.text=intent.getStringExtra("EXTRA_EMAIL")
    }
}