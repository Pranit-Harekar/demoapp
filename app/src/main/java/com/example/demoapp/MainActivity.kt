package com.example.demoapp

import android.app.ActivityOptions
import android.content.Context
import android.content.Intent
import android.hardware.display.DisplayManager
import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // render first activity
        this.startActivity(Intent(this, FirstActivity::class.java))

        // get displays
        val displayManager = this.getSystemService(Context.DISPLAY_SERVICE) as DisplayManager
        val displays = displayManager.displays

        // render second activity
        if (displays.size > 1) {
            val options = ActivityOptions.makeBasic()
            options.launchDisplayId = displays[1].displayId

            val intent = Intent(this, SecondActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            this.startActivity(intent, options.toBundle())
        }
    }
}