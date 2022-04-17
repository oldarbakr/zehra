package com.oldar.zehra

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main5.*
import kotlinx.android.synthetic.main.activity_main8.*

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)
    }

    fun btnSubmit(view: View) {
        val intent = Intent(this, MainActivity9::class.java)
        intent.putExtra("Player1",editTextTextPlayer1.text.toString())
        intent.putExtra("Player2",editTextTextPlayer2.text.toString())
        startActivity(intent)
    }


}