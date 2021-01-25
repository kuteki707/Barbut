package com.kuteki.barbut_simulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_five_dice.*

private var total_value = 0

class five_dice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five_dice)
        var dice:Dice = Dice()

        button_5.setOnClickListener {
            total_value = 0
            var randoms = dice.map_creation(5)

            randoms.forEach { (key,value) -> run{

                findViewById<ImageView>(resources.getIdentifier("img_dice_5_$key", "id", packageName))
                    .setImageResource(resources.getIdentifier("ic_dice_vector_$value", "drawable", packageName))
                total_value += value
            }
            }
            text_view_5.text = total_value.toString()
        }
    }
}