package com.kuteki.barbut_simulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        btn_1_dice.setOnClickListener {
            val intent = Intent(this,one_dice::class.java)
            startActivity(intent)
        }

        btn_2_dice.setOnClickListener {
            val intent = Intent(this,two_dice::class.java)
            startActivity(intent)
        }

        btn_3_dice.setOnClickListener {
            val intent = Intent(this,three_dice::class.java)
            startActivity(intent)
        }

        btn_4_dice.setOnClickListener {
            val intent = Intent(this,four_dice::class.java)
            startActivity(intent)
        }

        btn_5_dice.setOnClickListener {
            val intent = Intent(this,five_dice::class.java)
            startActivity(intent)
        }

        btn_6_dice.setOnClickListener {
            val intent = Intent(this,six_dice::class.java)
            startActivity(intent)
        }



    }
}