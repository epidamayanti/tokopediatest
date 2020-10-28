package com.tokopedia.minimumpathsum

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.tokopedia.core.loadFile
import java.util.*

class MinimumPathSumActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problem)
        val webView = findViewById<WebView>(R.id.webView)
        webView.loadFile("minimum_path_sum.html")

        // example of how to call the function
        val inp = arrayOf(
                intArrayOf(1, 3, 1),
                intArrayOf(1, 5, 1),
                intArrayOf(4, 2, 1))
        val number = Solution.minimumPathSum(inp)

        println("Output Minimum Path Sum: "+number)

        val input = findViewById<TextView>(com.tokopedia.resources.R.id.input)
        input.text = ""+ inp.contentDeepToString()

        val hasil = findViewById<TextView>(com.tokopedia.resources.R.id.hasil)
        hasil.text = ""+number

    }

}