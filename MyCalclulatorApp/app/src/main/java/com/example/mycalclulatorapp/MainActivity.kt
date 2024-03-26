package com.example.mycalclulatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
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
        var num1Field=findViewById<EditText>(R.id.num1)

        var num2Field=findViewById<EditText>(R.id.num2)

        var addBtn=findViewById<Button>(R.id.addBtn)
        var minusBtn=findViewById<Button>(R.id.minusBtn)
        var divideBtn=findViewById<Button>(R.id.divideBtn)
        var mutltiBtn=findViewById<Button>(R.id.multiplyBtn)
        var output=findViewById<TextView>(R.id.resultTv)

        fun add(){
            var num1=num1Field.text.toString().toInt()
            var num2=num2Field.text.toString().toInt()
            var result=num1+num2
            output.text=result.toString()
            num1Field.text.clear()
            num2Field.text.clear()
        }

        fun minus(){
            var num1=num1Field.text.toString().toInt()
            var num2=num2Field.text.toString().toInt()
            var result=num1-num2
            output.text=result.toString()
            num1Field.text.clear()
            num2Field.text.clear()
        }

        fun divide(){
            var num1=num1Field.text.toString().toInt()
            var num2=num2Field.text.toString().toInt()
            var result=num1/num2
            output.text=result.toString()
            num1Field.text.clear()
            num2Field.text.clear()
        }
        fun multiply(){
            var num1=num1Field.text.toString().toInt()
            var num2=num2Field.text.toString().toInt()
            var result=num1*num2
            output.text=result.toString()
            num1Field.text.clear()
            num2Field.text.clear()
        }







        addBtn.setOnClickListener {

            add()
        }

        minusBtn.setOnClickListener {
            minus()
        }

        divideBtn.setOnClickListener {
            divide()
        }

        mutltiBtn.setOnClickListener {
            multiply()
        }







    }

}
