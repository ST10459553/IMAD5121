package com.example.registrationpage

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registration)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val registerBtn=findViewById<Button>(R.id.registerBtn)
        val nameField=findViewById<EditText>(R.id.name)
        val surnameField=findViewById<EditText>(R.id.surnameEt)
        val emailField=findViewById<EditText>(R.id.emailEt)
        val passwordField=findViewById<EditText>(R.id.passwordEt)
        val confirmPasswordField=findViewById<EditText>(R.id.confirmPasswordEt)
        var name=nameField.text.toString()
        var surname=surnameField.text.toString()
        var email=emailField.text.toString()
        var password=passwordField.text.toString()


        registerBtn.setOnClickListener {
            var welcomeScreen= Intent(this, Welcome::class.java).also {
                it.putExtra("EXTRA_NAME",name)
                it.putExtra("EXTRA_SURNAME",surname)
                it.putExtra("EXTRA_EMAIL",email)
                it.putExtra("EXTRA_PASSWORD",password)
            }
        startActivity(welcomeScreen)
        }





        val homeBtn=findViewById<Button>(R.id.homeBtn)
        var loginBtn=findViewById<Button>(R.id.logInBtn)

        homeBtn.setOnClickListener {
            home(this)
        }
        loginBtn.setOnClickListener {
            login(this)
        }

    }
}