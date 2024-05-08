package com.example.registrationpage

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainLogin)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val emailField=findViewById<EditText>(R.id.emailEt)
        val passwordField=findViewById<EditText>(R.id.passwordEt)
        val registrationBtn=findViewById<Button>(R.id.registrationBtn)
        val homeBtn=findViewById<Button>(R.id.homeBtn)

        registrationBtn.setOnClickListener {

            registration(this)
        }

        homeBtn.setOnClickListener {
            home(this )
        }


    }
}