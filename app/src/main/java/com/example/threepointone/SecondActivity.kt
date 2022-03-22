package com.example.threepointone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val intent = intent
        var firstNum = intent.getIntExtra("firstNum",0)
        var secondNum = intent.getIntExtra("secondNum",0)
        val textView: TextView = findViewById(R.id.textView)
        val yes: Button = findViewById(R.id.yes)
        val no: Button = findViewById(R.id.no)
        var a = 0
        var finish = false

        textView.setText("Ваше число от ${firstNum} до ${secondNum}?")
        yes.setOnClickListener{
            if(!finish) {
                if (secondNum - firstNum > 1) {
                    a = secondNum
                    secondNum = secondNum - (secondNum - firstNum) / 2
                    textView.setText("Ваше число от ${firstNum} до ${secondNum}?")
                }
                else {
                    textView.setText("Ваше число ${firstNum}?")
                    finish = true
                }
            }
            else textView.setText("Ваше число ${firstNum}!")
        }
        no.setOnClickListener{
            if(!finish) {
                if (secondNum - firstNum > 1) {
                    firstNum = secondNum + 1
                    secondNum = a
                    textView.setText("Ваше число от ${firstNum} до ${secondNum}?")
                }
                else textView.setText("Ваше число ${secondNum + 1}!")
            }
            else textView.setText("Ваше число ${secondNum}!")
        }
    }
}