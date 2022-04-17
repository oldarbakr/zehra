package com.oldar.zehra

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)



    }

    fun btnNext5(view: View) {
        val intent = Intent(this, MainActivity5::class.java)
        startActivity(intent)
    }
}