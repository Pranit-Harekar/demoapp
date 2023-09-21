package com.example.demoapp

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val myWebView = findViewById<WebView>(R.id.webview)
        myWebView.loadUrl("https://www.mozilla.org/")
    }
}