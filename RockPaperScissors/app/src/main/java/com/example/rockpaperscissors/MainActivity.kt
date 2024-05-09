package com.example.rockpaperscissors

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

data class Score(var win:Int, var loss:Int, var draw:Int){
    fun increaseWIn(){
        win++
    }
    fun increaseLoss(){
        loss++
    }
    fun increaseTie(){
        draw++
    }

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

        val rockBtn=findViewById<Button>(R.id.rockBtn)
        val paperBtn=findViewById<Button>(R.id.paperBtn)
        val scissorBtn=findViewById<Button>(R.id.scissorsBtn)
        val userMoveIv=findViewById<ImageView>(R.id.moveIv)
        val aiMoveIv=findViewById<ImageView>(R.id.AiMoveIv)
        val resultTv=findViewById<TextView>(R.id.resultTv)
        val scoreTv=findViewById<TextView>(R.id.scoreBar)
        val rockImg=R.drawable.rock
        val paperImg=R.drawable.paper
        val scissorImg=R.drawable.scissors
        var userMove:String=""
        var aiMove:String=""
        var result=""
        var score=Score(0,0,0)



        fun setImage(img:Int){

            userMoveIv.setImageResource(img)


        }

        fun setAiImage(img:Int){
            aiMoveIv.setImageResource(img)
        }

        fun randomMove(){
            val randoNumber=(1..3).random()
            if (randoNumber==1){
                aiMove="paper"
                setAiImage(paperImg)
            }
            else if (randoNumber==2){
                aiMove="rock"
                setAiImage(rockImg)
            }
            else{
                aiMove="scissor"
                setAiImage(scissorImg)
            }

        }

        fun conditions(){
            if (userMove=="rock"){
                if (aiMove==userMove){
                    result="Tie"
                    resultTv.setText(result)

                }
                else if (aiMove=="paper"){
                    result="Loss"
                    resultTv.setText(result)
                }
                else if(aiMove=="scissor"){
                    result="Win"
                    resultTv.setText(result)
                }
            }
            if (userMove=="paper"){
                if (aiMove==userMove){
                    result="Tie"
                    resultTv.setText(result)
                }
                else if (aiMove=="scissor"){
                    result="Loss"
                    resultTv.setText(result)
                }
                else if(aiMove=="rock"){
                    result="Win"
                    resultTv.setText(result)
                }
            }
            if (userMove=="scissor"){
                if (aiMove==userMove){
                    result="Tie"
                    resultTv.setText(result)
                }
                else if (aiMove=="rock"){
                    result="Loss"
                    resultTv.setText(result)
                }
                else if(aiMove=="paper"){
                    result="Win"
                    resultTv.setText(result)
                }
            }

        }
        fun scoreControl(){

            if (result=="Win"){
                score.increaseWIn()
            }
            else if (result=="Loss"){
                score.increaseLoss()
            }
            else if (result=="Tie"){
                score.increaseTie()
            }

            scoreTv.text=("W: ${score.win}  L: ${score.loss}  D: ${score.draw}")
        }

        fun  start(){
            randomMove()
            conditions()
            scoreControl()
        }




        rockBtn.setOnClickListener {

            userMove="rock"
            setImage(rockImg)
            start()

        }

        paperBtn.setOnClickListener {

            userMove="paper"
            setImage(paperImg)
            start()

        }

        scissorBtn.setOnClickListener {
            userMove="scissor"
            setImage(scissorImg)
            start()
        }


    }




}
