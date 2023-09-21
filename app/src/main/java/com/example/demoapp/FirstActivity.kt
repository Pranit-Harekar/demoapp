package com.example.demoapp

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val myWebView = findViewById<WebView>(R.id.webview)
        myWebView.webViewClient = WebViewClient()
        myWebView.settings.javaScriptEnabled = true
        myWebView.loadUrl("https://www.google.com")
    }
}