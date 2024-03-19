package com.example.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var inputName=findViewById<EditText>(R.id.inputName)
        val tv1=findViewById<TextView>(R.id.tv1)
        val btnLogIn=findViewById<Button>(R.id.btnLogIn)
        val inputPhone=findViewById<TextView>(R.id.inputPhone)
        val inputEmail=findViewById<TextView>(R.id.inputEmail)
        val inputPassword=findViewById<TextView>(R.id.inputPassword)
        val inputConfirmPassword=findViewById<TextView>(R.id.inputConfirmPassword)







        btnLogIn.setOnClickListener {
           tv1.text="hello ${inputName.text}"
            inputName.text.clear()


        }
    }
}