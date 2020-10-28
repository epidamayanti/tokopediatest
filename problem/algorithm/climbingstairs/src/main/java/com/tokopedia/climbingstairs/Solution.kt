package com.tokopedia.climbingstairs

import android.util.Log

object Solution {
    fun climbStairs(n: Int): Long {
        val result: Long
        // TODO, return in how many distinct ways can you climb to the top. Each time you can either climb 1 or 2 steps.
        // 1 <= n < 90
        if(n < 1 || n > 90 )
            result = 1
        else if(n < 3)
            result = n.toLong()
        else {
            var step1 = 1
            var step2 = 2
            for(i in 2 until n) {
                val current = step1 + step2
                step1 = step2
                step2 = current
            }
            result =step2.toLong()
        }

        Log.d("result", ""+result)
        return result
    }
}
