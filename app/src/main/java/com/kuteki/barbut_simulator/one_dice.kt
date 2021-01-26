package com.kuteki.barbut_simulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_one_dice.*
import kotlinx.android.synthetic.main.activity_two_dice.*

private var total_value = 0

class one_dice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one_dice)

        var dice:Dice = Dice()

        button_1.setOnClickListener {
            total_value = 0
            var randoms = dice.map_creation(1)

            randoms.forEach { (key,value) -> run{

                findViewById<ImageView>(resources.getIdentifier("img_dice_1_$key", "id", packageName))
                    .setImageResource(resources.getIdentifier("ic_dice_$value", "drawable", packageName))
                total_value += value
            }
            }
            text_view_1.text = total_value.toString()
        }
        }

    }
