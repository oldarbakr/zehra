package com.oldar.zehra

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main5.*

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

    }
    fun btnPlay(view: View) {
        val intent = Intent(this, MainActivity8::class.java)
        startActivity(intent)
    }
}