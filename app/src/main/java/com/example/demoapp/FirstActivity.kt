package com.example.demoapp

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val myWebView = findViewById<WebView>(R.id.webview)
        myWebView.loadUrl("https://www.google.com")
    }
}