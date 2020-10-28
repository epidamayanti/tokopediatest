package com.tokopedia.oilreservoir

import android.util.Log

/**
 * Created by fwidjaja on 2019-09-24.
 */
object Solution {
    fun collectOil(height: IntArray): Int {
        // TODO, return the amount of oil blocks that could be collected
        // below is stub
        val size = height.size - 1
        var prev = height[0]
        var prevIndex = 0
        var oil = 0
        var temp = 0

        for(i in 1 .. size){
            if (height[i] >= prev) {
                prev = height[i]
                prevIndex = i
                temp = 0
            } else {
                oil += prev - height[i]
                temp += prev - height[i]
            }
        }

        if(prevIndex < size){
            oil -= temp
            prev = height[size]

            for (i in size downTo prevIndex) {
                if (height[i] >= prev) {
                    prev = height[i]
                } else {
                    oil += prev - height[i]
                }
            }
        }

        Log.d("result", ""+oil)

        return oil
    }
}
