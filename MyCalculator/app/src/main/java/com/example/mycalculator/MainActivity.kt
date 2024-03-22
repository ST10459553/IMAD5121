package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num1=findViewById<EditText>(R.id.num1)
        var num1Value=num1.text.toString().toInt()
        var num2=findViewById<EditText>(R.id.num2)
        var num2Value=num2.text.toString().toInt()
        val addBtn=findViewById<Button>(R.id.addBtn)
        val minusBtn=findViewById<Button>(R.id.minusBtn)
        val divideBtn=findViewById<Button>(R.id.divideBtn)
        val multiplyBtn=findViewById<Button>(R.id.multiplyBtn)
        var result=findViewById<TextView>(R.id.resultTv)
        var total:Int=0



    addBtn.setOnClickListener {
        fun add(num1:Int, num2:Int): Int {
            total= num1+num2
            return total
        }


       add(num1Value,num2Value)
        result.text= "your result is ${total}"




        }












    }








}



