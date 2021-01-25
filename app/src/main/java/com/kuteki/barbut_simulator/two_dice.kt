package com.kuteki.barbut_simulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_one_dice.*
import kotlinx.android.synthetic.main.activity_two_dice.*

class two_dice : AppCompatActivity() {
    /*var dice_1_value:Int = 1
    var dice_2_value:Int = 1*/
     private var total_value:Int = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_dice)
        var dice:Dice = Dice()

        button_2.setOnClickListener {
            total_value = 0
            var randoms = dice.map_creation(2)

            randoms.forEach { (key,value) -> run{

                findViewById<ImageView>(resources.getIdentifier("img_dice_2_$key", "id", packageName))
                        .setImageResource(resources.getIdentifier("ic_dice_vector_$value", "drawable", packageName))
                total_value += value
                }
            }
            text_view_2.text = total_value.toString()
        }
        /*button_2.setOnClickListener {
            dice_1_value = (1..6).random()
            dice_2_value = (1..6).random()
            total_value = 0
            when (dice_1_value) {
                1 -> {
                    img_dice_2_1.setImageResource(R.drawable.dice1)
                    total_value += 1
                }
                2 -> {
                    img_dice_2_1.setImageResource(R.drawable.dice2)
                    total_value += 2
                }
                3 -> {
                    img_dice_2_1.setImageResource(R.drawable.dice3)
                    total_value += 3
                }
                4 -> {
                    img_dice_2_1.setImageResource(R.drawable.dice4)
                    total_value += 4
                }
                5 -> {
                    img_dice_2_1.setImageResource(R.drawable.dice5)
                    total_value += 5
                }
                6 -> {
                    img_dice_2_1.setImageResource(R.drawable.dice6)
                    total_value += 6
                }
            }
            when(dice_2_value){
                1 -> {
                    img_dice_2_2.setImageResource(R.drawable.dice1)
                    total_value += 1
                }
                2 -> {
                    img_dice_2_2.setImageResource(R.drawable.dice2)
                    total_value += 2
                }
                3 -> {
                    img_dice_2_2.setImageResource(R.drawable.dice3)
                    total_value += 3
                }
                4 -> {
                    img_dice_2_2.setImageResource(R.drawable.dice4)
                    total_value += 4
                }
                5 -> {
                    img_dice_2_2.setImageResource(R.drawable.dice5)
                    total_value += 5
                }
                6 -> {
                    img_dice_2_2.setImageResource(R.drawable.dice6)
                    total_value += 6
                }
            }
        text_view_2.text = total_value.toString()
        }*/
    }
}