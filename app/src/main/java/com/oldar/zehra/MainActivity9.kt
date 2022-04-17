package com.oldar.zehra

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main9.*

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)

        val Player1 = intent.getStringExtra("Player1")
        val Player2 = intent.getStringExtra("Player2")
        txtPlayer1.text = "Welcome $Player1 !"
        txtPlayer2.text = "Welcome $Player2 !"
    }
}