package com.kuteki.barbut_simulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_three_dice.*
import kotlinx.android.synthetic.main.activity_two_dice.*

private var total_value = 0
class three_dice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_dice)

        var dice:Dice = Dice()

        button_3.setOnClickListener {
            total_value = 0
            var randoms = dice.map_creation(3)

            randoms.forEach { (key,value) -> run{

                findViewById<ImageView>(resources.getIdentifier("img_dice_3_$key", "id", packageName))
                    .setImageResource(resources.getIdentifier("dice$value", "drawable", packageName))
                total_value += value
            }
            }
            text_view_3.text = total_value.toString()
        }
    }

 }
