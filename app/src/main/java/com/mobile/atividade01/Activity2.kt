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
        var valueActivity2 = valueFromActivity1+increment
        btnCounterAtv2.text = valueActivity2.toString()

        btnCounterAtv2.setOnClickListener {
            var valueForActivity1 = valueActivity2+increment // valueActivity2 equals to (btnCounterAtv2.text.toString()).toInt()
            var i = Intent(this, Activity1::class.java).apply{
                putExtra("value", valueForActivity1.toString())
            }
            setResult(Activity.RESULT_OK, i)
            finish()
        }
    }
}
