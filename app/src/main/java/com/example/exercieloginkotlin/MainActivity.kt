package com.example.exercieloginkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get reference to all views
        val enter_email = findViewById<EditText>(R.id.enter_email_address)
        val enter_password = findViewById<EditText>(R.id.enter_password)
        val btn_submit = findViewById<Button>(R.id.button_submit)

        btn_submit.setOnClickListener {
            val userName = enter_email.text.toString()
            val password = enter_password.text.toString()

            Log.i("MainActivity", "login submit : $userName and $password")
        }

    }

}