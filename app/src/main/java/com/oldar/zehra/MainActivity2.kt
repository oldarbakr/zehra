package com.oldar.zehra

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    }

    fun Calculate(view: View) {
        textMassage.text="";
        var result = 0
        val input :Int? = ETextNumber.text.toString().toIntOrNull()
        when{
            //startsWith '0' validation
            ETextNumber.text.toString().startsWith('0')->{textMassage.text="Number can not start with 0"}
            //isEmpty validation
            ETextNumber.text.toString().isEmpty()->{textMassage.text="Please enter a valid number"}
            //radioButtonGroup isChecked validation
            !radioButton.isChecked&&!radioButton2.isChecked->{textMassage.text="Please select one radio"}
            //radioButton1 isChecked validation and code
            radioButton.isChecked->{
                result= input!! *10/100
                Toast.makeText(this, "Int type Result: $result", Toast.LENGTH_SHORT).show()}
            //radioButton1 isChecked validation and code
            radioButton2.isChecked->{
                result= input!! *12/100
                Toast.makeText(this, "Int type Result: $result", Toast.LENGTH_SHORT).show()}
        }
    }

    fun btnNextTo3(view: View) {
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }
}