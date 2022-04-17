package com.oldar.zehra

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main5.*

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
    }

    fun btnStart(view: View) {
        val intent = Intent(this, MainActivity6::class.java)
        when {
            editTextPersonName.text.isNullOrBlank() -> {
                Toast.makeText(this, "Please enter a valid name", Toast.LENGTH_SHORT).show()
            }
            editTextPersonName.text.length>10 -> {
                Toast.makeText(this, "Please enter a shorter name", Toast.LENGTH_SHORT).show()
            }
            else -> {
                intent.putExtra("gamerName",editTextPersonName.text.toString())
                startActivity(intent)
            }
        }
    }
}