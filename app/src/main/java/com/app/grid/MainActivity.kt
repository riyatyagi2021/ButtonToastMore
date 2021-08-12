package com.app.grid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_toast.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button1.setOnClickListener(){
            //Toast.makeText(this,"Button is clicked",Toast.LENGTH_SHORT).show()


            var name=personname.editableText.toString()

            val intent=Intent(this,Dogs::class.java)
            intent.putExtra("name",name)
            startActivity(intent)

        }




        val layout=layoutInflater.inflate(R.layout.custom_toast,linearlay)
        button2.setOnClickListener(){

            val myToast = Toast(applicationContext)
            myToast.duration = Toast.LENGTH_LONG
          //  myToast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
            myToast.view = layout//setting the view of custom toast layout
            myToast.show()
        }

    }


}