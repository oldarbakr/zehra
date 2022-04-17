package com.oldar.zehra

import android.content.Intent
import android.os.Bundle
import android.support.v4.view.MotionEventCompat
import android.support.v7.app.AppCompatActivity
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        //keyboard automatic pop blocker
        editTextInput.showSoftInputOnFocus = false

    }

    var x: Double? = 0.0
    var y: Double? = 0.0
    var operation: Char? = null
    var result: Double? = null

    fun btn1(view: View) {editTextInput.append("1")}
    fun btn2(view: View) {editTextInput.append("2")}
    fun btn3(view: View) {editTextInput.append("3")}
    fun btn4(view: View) {editTextInput.append("4")}
    fun btn5(view: View) {editTextInput.append("5")}
    fun btn6(view: View) {editTextInput.append("6")}
    fun btn7(view: View) {editTextInput.append("7")}
    fun btn8(view: View) {editTextInput.append("8")}
    fun btn9(view: View) {editTextInput.append("9")}
    fun btn0(view: View) {editTextInput.append("0")}
    fun btnDot(view: View) {if(!editTextInput.text.contains('.')){editTextInput.append(".")}}
    fun btnClear(view: View) {editTextInput.setText("");x=0.0;y=0.0;operation=null;result=null}
    fun btnMinus(view: View) {if(inputValidation()){x = editTextInput.text.toString().toDoubleOrNull(); operation='-'; editTextInput.setText("")}}
    fun btnPlus(view: View) {if(inputValidation()){x = editTextInput.text.toString().toDoubleOrNull(); operation='+'; editTextInput.setText("")}}
    fun btnDivide(view: View) {if(inputValidation()){x = editTextInput.text.toString().toDoubleOrNull(); operation='/'; editTextInput.setText("")}}
    fun btnMultiply(view: View) {if(inputValidation()){x = editTextInput.text.toString().toDoubleOrNull(); operation='*'; editTextInput.setText("")}}
    fun btnDelete(view: View) {
        val text = editTextInput.text.toString()
        if (text.isNotEmpty()) {
            editTextInput.text.delete(text.length-1,text.length)
        }}
    fun btnEqual(view: View) {textViewAlert.text="";if(inputValidation()){y = editTextInput.text.toString().toDoubleOrNull();
        when (operation) {
            '+' -> {result= x!! + y!!}
            '-' -> {result= x!! - y!!}
            '*' -> {result= x!! * y!!}
            '/' -> {if(divideValidation()){result= x!! / y!!}}
            else -> {result = y}
        }
        editTextInput.setText("$result")}
    }
    fun inputValidation(): Boolean {
        when{
            editTextInput.text.isNullOrEmpty()->{
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show();return false
            }else->{return true}
        }
    }
    fun divideValidation(): Boolean {
        when{y==0.0->{
                Toast.makeText(this, "Can't divide on 0", Toast.LENGTH_SHORT).show();return false
            }else->{return true}}
    }
    fun btnNext4(view: View) {
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
    }
}

