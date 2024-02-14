package com.example.decapodips

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class EbiKaniWelcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ebi_kani_welcome)

        // back to sign up page
        val backBtn = findViewById<ImageView>(R.id.backBtn)

        backBtn.setOnClickListener{
            val intent = Intent(this, SignUpPage::class.java)
            startActivity(intent)
        }
        // submit button
        val submitBtn = findViewById<Button>(R.id.submitBtn)

        submitBtn.setOnClickListener {
            val message:String =findViewById<EditText>(R.id.showText).text.toString()

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("username", message)
            startActivity(intent)

        }
    }
}