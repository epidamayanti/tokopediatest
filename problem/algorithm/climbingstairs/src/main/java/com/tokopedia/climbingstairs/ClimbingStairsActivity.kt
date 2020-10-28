package com.tokopedia.climbingstairs

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.tokopedia.core.loadFile

class ClimbingStairsActivity: AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problem)
        val webView = findViewById<WebView>(R.id.webView)
        webView.loadFile("climbing_stairs.html")

        // example of how to call the function
        Solution.climbStairs(10)

        val input = findViewById<TextView>(com.tokopedia.resources.R.id.input)
        input.text = ""+10

        val hasil = findViewById<TextView>(com.tokopedia.resources.R.id.hasil)
        hasil.text = ""+Solution.climbStairs(10)
    }
}