package com.example.bmiapp

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val maleBmiText=intent.getStringExtra("BMI_MALE")
        val femaleBmiText=intent.getStringExtra("BMI_FEMALE")
        val statusTv=findViewById<TextView>(R.id.status)
        val resultTv=findViewById<TextView>(R.id.bmiResult)
        var maleBmi:Double
        var femaleBmi:Double


       fun maleBmiRange(){
           maleBmi=maleBmiText.toString().toDouble()
           if (maleBmi<18.5){
                statusTv.setText("You are underweight")
               statusTv.setTextColor(Color.BLUE)
           }

           else if (maleBmi in 18.5..24.9){
               statusTv.setText("You are normal")
               statusTv.setTextColor(Color.GREEN)
           }
           else if (maleBmi in 25.0 ..29.9){
               statusTv.setText("You are OverWeight")
               statusTv.setTextColor(Color.YELLOW)

           }

           else if (maleBmi>=30){
               statusTv.setText("You are Obese")
               statusTv.setTextColor(Color.RED)
           }

       }

        fun femaleBmiRange(){
            femaleBmi=femaleBmiText.toString().toDouble()
            if (femaleBmi<18.5){
                statusTv.setText("You are underweight,women!!!")
                statusTv.setTextColor(Color.BLUE)
            }
            else if (femaleBmi in 18.5..24.9){
                statusTv.setText("You are normal")
                statusTv.setTextColor(Color.GREEN)
            }
            else if (femaleBmi in 25.0 ..30.0){
                statusTv.setText("You are OverWeight")
                statusTv.setTextColor(Color.YELLOW)

            }

            else if (femaleBmi>30){
                statusTv.setText("You are Obese")
                statusTv.setTextColor(Color.RED)
            }
        }




       if(maleBmiText==null){

           femaleBmiRange()
           resultTv.text=femaleBmiText

       }
        else{
            maleBmiRange()
           resultTv.text=maleBmiText
       }




    }
}