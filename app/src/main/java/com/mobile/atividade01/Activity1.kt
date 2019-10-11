package com.mobile.atividade01

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_1.*

class Activity1 : AppCompatActivity() {

    var increment = 1;
    var default_valor_error = -1;
    var requestCode = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        btnCounterAtv1.setOnClickListener {
            val i = Intent(this, Activity2::class.java).apply{
                putExtra("value", btnCounterAtv1.text.toString().toInt())
            }
            startActivityForResult(i, requestCode)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == requestCode && resultCode == Activity.RESULT_OK){
            val info = data?.getIntExtra("value", default_valor_error)
            if (info != null)
            btnCounterAtv1.text = (info+increment).toString()
        }
    }
}

