package com.kuteki.barbut_simulator

import kotlin.random.Random

open class Dice {
    fun map_creation(x:Int):MutableMap<Int,Int> {
        var map = mutableMapOf<Int, Int>()
        for (i in (1..x))
            map.put(i,(1..6).random())
        return map
    }


}