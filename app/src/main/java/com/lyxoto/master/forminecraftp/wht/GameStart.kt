package com.lyxoto.master.forminecraftp.wht

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lyxoto.master.forminecraftp.R
import kotlinx.android.synthetic.main.activity_game_start.*

class GameStart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_start)
        startgame.setOnClickListener {
            startActivity(Intent(this, GameItself::class.java))
        }
    }
}