package com.kuteki.barbut_simulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_five_dice.*
import kotlinx.android.synthetic.main.activity_six_dice.*

private var total_value = 0

class six_dice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_dice)

        var dice:Dice= Dice()

        button_6.setOnClickListener {
            total_value = 0
            var randoms = dice.map_creation(6)

            randoms.forEach { (key,value) -> run{

                findViewById<ImageView>(resources.getIdentifier("img_dice_6_$key", "id", packageName))
                    .setImageResource(resources.getIdentifier("dice$value", "drawable", packageName))
                total_value += value
            }
            }
            text_view_6.text = total_value.toString()
        }


    }
}