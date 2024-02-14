package com.example.decapodips

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LogInPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in_page)

        // link register text
        val signUptxt = findViewById<TextView>(R.id.loginText)

        signUptxt.setOnClickListener{
            var intent = Intent(this, SignUpPage::class.java)
            startActivity(intent)
        }

//      link the login button
        val loginBtn = findViewById<Button>(R.id.loginBtn)

        loginBtn.setOnClickListener {
            val message: String = findViewById<EditText>(R.id.showMessageTxt).text.toString()
            var intent = Intent(this, MainActivity::class.java)
            intent.putExtra("login_username", message)
            startActivity(intent)
        }

    }
}