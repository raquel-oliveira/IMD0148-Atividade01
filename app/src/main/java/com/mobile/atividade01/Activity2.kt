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

        var valueFromActivity1 = intent.getIntExtra("value", 1)
        btnCounterAtv2.text = (valueFromActivity1+increment).toString()

        btnCounterAtv2.setOnClickListener {
            var i = Intent(this, Activity1::class.java).apply{
                putExtra("value", (valueFromActivity1+increment+increment).toString())
            }
            setResult(Activity.RESULT_OK, i)
            finish()
        }
    }
}
