package com.lyxoto.master.forminecraftp.wht

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lyxoto.master.forminecraftp.R
import kotlinx.android.synthetic.main.activity_finish.*

class Finish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        tryagain.setOnClickListener{
            startActivity(Intent(this, GameItself::class.java))
        }
    }
}