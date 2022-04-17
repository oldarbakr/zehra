package com.oldar.zehra

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Homework 1");
        //Sumdigit(4,5)
        //var output = Mulply(2, 9)
        //Toast.makeText(this, "output: "+output, Toast.LENGTH_LONG).show()

        btnMassage.setOnClickListener(){
            var Email = ETextEmail.text
            var Password = ETextPassword.text
            var massage = "Email is: $Email \nPassword is: $Password"
            TextMassage.text = massage
        }
    }

    fun btnLogin(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }

    private fun Sumdigit(x: Int, y: Int){
        var result = x+y
        Toast.makeText(this, "result: "+result, Toast.LENGTH_LONG).show()
    }

    private fun Mulply(x: Int, y: Int):Int {
        return x*y
    }
}









/*
        var globalInt = 0
        var localInt = 8 //local int = 8
        var localDouble = 4.0 //local Double = 4.0

        var name = "Oldar"
        var lastname = "BAKR"

        var result = "name: $name lastname: $lastname"

        var str = "My name is Oldar"
        var Sresult1 = str.contains("Zehra")
        var Sresult2 = str.subSequence(0,10)
        var lastName:String ? //can take a null value
*/

/*
        Log.i("Kotlin", localInt.toString())

        var z = localInt % localDouble
        Log.i("kotlin",z.toString())

        Log.i("kotlin",name+" "+lastname)

        Log.i("kotlin",name+" "+localInt)
*/

/*
        var y:Int = 5
        Log.i("kotlin",name+" "+localInt)
        Log.i("kotlin",result)
        */
/*
        lastName = "must be initialized"
        Log.i("kotlin",lastName)
*/

/*
        Log.i("kotlin",Sresult1.toString())
        Log.i("kotlin",Sresult1.toString().length.toString())
*/

/*
        var x = 4
        val y = 5
        x = 3
        y = 2
*/


/*        var a = 12
        var b = 65
        var result = a - b*/


/*
        if (result<0){
            Log.i("kotlin","result is: $result is nigative number")
        }else if(result==0){
            Log.i("kotlin","result is: $result is zero")
        }else{
            Log.i("kotlin","result is: $result is positive number")
        }
        */
/*        var digit = 20
        when{
            digit<0->{Log.i("kotlin","result is: $result is nigative number")}
            digit>0->{Log.i("kotlin","result is: $result is positive number")}
            digit==0->{Log.i("kotlin","result is: $result is zero")}
        }
*/

/*        for(z in 1..10){
            Log.i("kotlin","Oldar: $z")
        }
*/
        //static array
        /*  var staticArray=Array(5){0}
        staticArray[0]=12
        staticArray[1]=31
        staticArray[2]=98
        staticArray[3]=45
        staticArray[4]=11
        *//*Log.i("kotlin","static: "+staticArray[0].toString())
        Log.i("kotlin","static: "+staticArray.get(3).toString())
*//*
        //dynamic array
        var dynamicArray = ArrayList<Int>()
        dynamicArray.add(12)
        dynamicArray.add(89)
        dynamicArray.add(10)
        dynamicArray.add(88)
        dynamicArray.add(55556)
        dynamicArray.add(2,175)
       *//* Log.i("kotlin","dynamic: "+dynamicArray[2].toString())
        Log.i("kotlin","dynamicSize: "+dynamicArray.size.toString())
        *//*
        for(element in dynamicArray)
        {
          //  Log.i("kotlin","dynamic: "+element.toString())

        }
        for (element in 0..7)
        {
            Log.i("kotlin","dynamic: "+dynamicArray[element].toString())

        }
    }*/

        /*fun btnclick(view: android.view.View) {
        startActivity(Intent(this@MainActivity, MainActivity2::class.java))
    }*/