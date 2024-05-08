package com.example.registrationpage

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

fun login(context:Context){
    val loginScreen=Intent(context,Login::class.java)
    context.startActivity(loginScreen)



}
fun registration(context: Context){

    val registrationScreen=Intent(context, Registration::class.java)
    context.startActivity(registrationScreen)

}
fun home(context:Context){
    val homeScreen=Intent(context,MainActivity::class.java)
    context.startActivity(homeScreen)

}
//fun welcome(context: Context, it:Intent){
//    val welcomeScreen=Intent(context, Welcome::class.java).also {
//
//    }
//    context.startActivity(welcomeScreen)
//
//}


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

        var loginBtn=findViewById<Button>(R.id.logInBtn)
        var registrationBtn=findViewById<Button>(R.id.registrationBtn)



        loginBtn.setOnClickListener {

            login(this)
        }

        registrationBtn.setOnClickListener {

            registration(this)
        }







    }

}



