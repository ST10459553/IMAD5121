package com.example.bmiapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

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
        val weightEt=findViewById<EditText>(R.id.weightEt)
        val ageEt=findViewById<EditText>(R.id.ageEt)
        val weightMnusBtn=findViewById<Button>(R.id.weightMinusBtn)
        val weightAddBtn=findViewById<Button>(R.id.weightAddBtn)
        val ageAddBtn=findViewById<Button>(R.id.ageAddBtn)
        val ageMinusBtn=findViewById<Button>(R.id.ageMinusBtn)
        var age:Int
        var weight:Double
        val heightEt=findViewById<EditText>(R.id.heightEt)
        var height:Double
        val maleBtn=findViewById<Button>(R.id.maleBtn)
        val femaleBtn=findViewById<Button>(R.id.femaleBtn)
        var result:Double
        val tv2=findViewById<TextView>(R.id.textView2)


        fun increment(field: EditText) {
            var value = field.text.toString().toIntOrNull() ?: 0

            field.setText((value+1).toString())
        }

        fun decrement(field: EditText) {
            var value = field.text.toString().toIntOrNull() ?: 0
            field.setText((value-1).toString())
        }




        weightMnusBtn.setOnClickListener {
            decrement(weightEt)
        }
        weightAddBtn.setOnClickListener {
            increment(weightEt)
        }

        ageAddBtn.setOnClickListener {
            increment(ageEt)
        }
        ageMinusBtn.setOnClickListener {
            decrement(ageEt)
        }

        fun bmiFormula(heightCm:Double, weight:Double):Double{

            var heightMeters= heightCm/100
            return weight/(heightMeters*heightMeters)

        }

        maleBtn.setOnClickListener {
            var heightText = heightEt.text.toString()
            var weightText = weightEt.text.toString()
            var ageText = ageEt.text.toString()
            if (heightText.isBlank()||weightText.isBlank()||ageText.isBlank()){

                Toast.makeText(this , "Do not leave field empty", Toast.LENGTH_SHORT).show()
        }
            else{
                height=heightText.toDouble()
                weight=weightText.toDouble()
                age=ageText.toInt()

                if (height<=0||weight<=0||age<=0){
                    Toast.makeText(this, "Enter Valid Numbers", Toast.LENGTH_SHORT).show()
                }

                result=bmiFormula(height,weight)
                var formattedValue= String.format("%.1f",result)


//                tv2.text=formattedValue

                val resultPage=Intent(this,MainActivity2::class.java).also {

                    it.putExtra("BMI_MALE",formattedValue)
                }


                startActivity(resultPage)


            }




        }


        femaleBtn.setOnClickListener {
            var heightText = heightEt.text.toString()
            var weightText = weightEt.text.toString()
            var ageText = ageEt.text.toString()
            if (heightText.isBlank()||weightText.isBlank()||ageText.isBlank()){

                Toast.makeText(this , "Do not leave field empty", Toast.LENGTH_SHORT).show()
            }
            else{
                height=heightText.toDouble()
                weight=weightText.toDouble()
                age=ageText.toInt()

                if (height<=0||weight<=0||age<=0){
                    Toast.makeText(this, "Enter Valid Numbers", Toast.LENGTH_SHORT).show()
                }

                result=bmiFormula(height,weight)
                var formattedValue= String.format("%.1f",result)
//                tv2.text=formattedValue
                val resultPage=Intent(this,MainActivity2::class.java).also {
                    it.putExtra("BMI_FEMALE",formattedValue)
                }
                startActivity(resultPage)

            }

        }


    }
}