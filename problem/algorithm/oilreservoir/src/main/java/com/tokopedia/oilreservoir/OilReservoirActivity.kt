package com.tokopedia.oilreservoir

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.tokopedia.core.loadFile
import java.util.*

/**
 * Created by fwidjaja on 2019-09-24.
 */
class OilReservoirActivity: AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problem)

        val webView = findViewById<WebView>(R.id.webView)
        webView.loadFile("oil_reservoir.html")

        // example of how to call the function
        val inp = intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)
        val number = Solution.collectOil(inp)

        val input = findViewById<TextView>(com.tokopedia.resources.R.id.input)
        input.text = ""+ inp.contentToString()

        val hasil = findViewById<TextView>(com.tokopedia.resources.R.id.hasil)
        hasil.text = ""+number
    }

}