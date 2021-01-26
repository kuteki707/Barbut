package com.kuteki.barbut_simulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)


        var activity_nr:Int = 0
        val dices = resources.getStringArray(R.array.dices_spinner)
        val arrayAdapter = ArrayAdapter(this,android.R.layout.select_dialog_item, dices)

        spinner_1.adapter = arrayAdapter

        spinner_1.onItemSelectedListener = object :

                AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                activity_nr = position + 1
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //nimic
            }
        }


        button_main.setOnClickListener {
            when(activity_nr){
                1 ->{
                    val intent = Intent(this,one_dice::class.java)
                    startActivity(intent)
                }
                2 ->{
                    val intent = Intent(this,two_dice::class.java)
                    startActivity(intent)
                }
                3->{
                    val intent = Intent(this,three_dice::class.java)
                    startActivity(intent)
                }
                4->{
                    val intent = Intent(this,four_dice::class.java)
                    startActivity(intent)
                }
                5->{
                    val intent = Intent(this,five_dice::class.java)
                    startActivity(intent)
                }
                6->{
                    val intent = Intent(this,six_dice::class.java)
                    startActivity(intent)
                }
            }
        }




        /*btn_1_dice.setOnClickListener {
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
*/



    }
}