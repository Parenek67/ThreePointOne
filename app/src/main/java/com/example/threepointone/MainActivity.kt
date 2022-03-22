package com.example.threepointone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstNum: EditText = findViewById(R.id.firstNum)
        val secondNum: EditText = findViewById(R.id.secondNum)
        val ok: Button = findViewById(R.id.ok)
        ok.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("firstNum", Integer.parseInt(firstNum.text.toString()))
            intent.putExtra("secondNum", Integer.parseInt(secondNum.text.toString()))
            startActivity(intent)
        }
    }
}