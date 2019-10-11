package com.mobile.atividade01

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {
    var increment = 1;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val intentInfoAsString = intent.getIntExtra("value", 1).toString()
        btnCounterAtv2.text = intentInfoAsString;

        btnCounterAtv2.setOnClickListener {
            var i = Intent(this, Activity1::class.java).apply{
                putExtra("value", (intentInfoAsString.toInt()+increment).toString())
            }
            setResult(Activity.RESULT_OK, i)
            finish()
        }
    }
}
