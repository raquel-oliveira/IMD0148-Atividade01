package com.mobile.atividade01

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_1.*

class Activity1 : AppCompatActivity() {

    var increment = 1;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        btnCounterAtv1.setOnClickListener {
            val i = Intent(this, Activity2::class.java).apply{
                putExtra("value", btnCounterAtv1.text.toString().toInt()+increment)
            }
            startActivityForResult(i, 0)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 0 && resultCode == Activity.RESULT_OK){
            btnCounterAtv1.text = data?.getStringExtra("value")
        }
    }
}

