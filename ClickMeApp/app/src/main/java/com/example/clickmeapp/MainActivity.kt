package com.example.clickmeapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
enum class Languages {
    English,
    French,
    Zulu
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val clickMeBtn=findViewById<Button>(R.id.clickMeBtn)
        var inputField=findViewById<EditText>(R.id.nameInput)
        var welcomeTv=findViewById<TextView>(R.id.WelcomeTv)
        val switchLang=findViewById<Switch>(R.id.switchFr)
//        var engGreeting="Welcome,${inputField.text}"
//        var frGreeting="Bienvenue,${inputField.text}"

       


        clickMeBtn.setOnClickListener {
            Toast.makeText(this@MainActivity, "Button Clicked",Toast.LENGTH_LONG).show()
//            welcomeTv.text="Welcome , ${inputField.text}"
            var engGreeting="Welcome , ${inputField.text}"
            var frGreeting="Bienvenue , ${inputField.text}"

            if (switchLang.isChecked){
                welcomeTv.text=frGreeting
            }
            else{
                welcomeTv.text=engGreeting
            }

            inputField.text.clear()
//            clearing the field after clicking

        }


    }
}