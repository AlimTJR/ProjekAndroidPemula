package com.example.okta.randompicker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollbtn.setOnClickListener { randomroll() }
    }
    fun randomroll(){
        val randomlk = Random().nextInt(4)+1
        val randomcw = Random().nextInt(4)+1
        val drawbleReslk = when (randomlk){
            1 ->R.drawable.lk1
            2 ->R.drawable.lk2
            3 ->R.drawable.lk3
            else ->R.drawable.lk4
        }
        val drawbleRescw = when (randomcw){
            1 ->R.drawable.cw1
            2 ->R.drawable.cw2
            3 ->R.drawable.cw3
            else ->R.drawable.cw4
        }
        image1.setImageResource(drawbleReslk)
        image2.setImageResource(drawbleRescw)
    }
}
