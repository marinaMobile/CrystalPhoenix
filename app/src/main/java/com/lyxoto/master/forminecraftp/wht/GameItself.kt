package com.lyxoto.master.forminecraftp.wht

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.lyxoto.master.forminecraftp.R
import kotlinx.android.synthetic.main.activity_game_itself.*
import java.util.*

class GameItself : AppCompatActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_itself)

        my_button.setOnClickListener{
            counter++
            check()
            my_button.visibility = View.INVISIBLE
            }
        my_button_two.setOnClickListener{
            counter++
            check()
            my_button_two.visibility = View.INVISIBLE
        }
        my_button_three.setOnClickListener{
            counter++
            check()
            my_button_two.visibility = View.INVISIBLE
        }

        val timer = Timer()


        timer.schedule(object : TimerTask() {
            override fun run() {
                runOnUiThread {
                    val random = Random()

                    val animationThree = my_button_three.animate()
                        .x(random.nextFloat() * ll_wasp.width)
                        .y(random.nextFloat() * ll_wasp.height)

                    val animationTwo = my_button_two.animate()
                        .x(random.nextFloat() * ll_wasp.width)
                        .y(random.nextFloat() * ll_wasp.height)

                    val animation = my_button.animate()
                        .x(random.nextFloat() * ll_wasp.width)
                        .y(random.nextFloat() * ll_wasp.height)

                    animationTwo.duration = 100
                    animationTwo.start()

                    animationThree.duration = 100
                    animationThree.start()

                    animation.duration = 100
                    animation.start()
                }
            }

        }, 0, 100)
    }
    fun check() {
        if(counter == 3) {
            startActivity(Intent(this, Finish::class.java))
            finish()
        }
    }
}


