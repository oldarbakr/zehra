package com.oldar.zehra

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main6.*

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val gamerName = intent.getStringExtra("gamerName")
        textViewGamerName.text = "Welcome $gamerName !"
    }
}