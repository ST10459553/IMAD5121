package com.example.registrationpage

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
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
        val userNameField=findViewById<EditText>(R.id.surnameEt)
        val emailField=findViewById<EditText>(R.id.emailEt)
        val passwordField=findViewById<EditText>(R.id.passwordEt)
        val confirmPasswordField=findViewById<EditText>(R.id.confirmPasswordEt)
        var name=nameField.text
        var userName=userNameField.text
        var email=emailField.text
        var password=passwordField.text
        var confirmPassword=confirmPasswordField.text
        val homeBtn=findViewById<Button>(R.id.homeBtn)
        var loginBtn=findViewById<Button>(R.id.logInBtn)

        fun emptyField(){
            if (name.isEmpty()||userName.isEmpty()||email.isEmpty()|| password.isEmpty()|| confirmPassword.isEmpty()){
                Toast.makeText(this, "Do not leave any field Empty", Toast.LENGTH_SHORT).show()
        }}

        fun passwordConfirmation(){
            if (password.length<=8){
                Toast.makeText(this, "Password should more than 8 characters", Toast.LENGTH_SHORT).show()
                }
            else if(confirmPassword!=password){
                Toast.makeText(this, "Passwords have to match", Toast.LENGTH_SHORT).show()}
            else{
                Toast.makeText(this, "password is correct", Toast.LENGTH_SHORT).show()
            }
        }

            fun userNameValidation(){
                if (userName.length<=8){
                    Toast.makeText(this, "UserName should be 8 or more characters", Toast.LENGTH_SHORT).show()
            }
            }



        homeBtn.setOnClickListener {
            home(this)
        }
        loginBtn.setOnClickListener {
            login(this)
        }


        registerBtn.setOnClickListener {

            emptyField()
            passwordConfirmation()
            userNameValidation()
          }

          }










    }
