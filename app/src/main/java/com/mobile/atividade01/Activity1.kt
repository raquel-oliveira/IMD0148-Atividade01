package com.mobile.atividade01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_1.*

class Activity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        var initialValue = 1;
        btnCounterAtv1.text = initialValue.toString();

        btnCounterAtv1.setOnClickListener {
            var value = btnCounterAtv1.text.toString();
            var i = Intent(this, Activity2::class.java).apply{
                putExtra("value", value.toInt())
            }
            startActivity(i)
        }
    }
}

