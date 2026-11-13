package com.toe3audio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this).apply {
            text = "TOE3 Audio Converter - Ready!"
            textSize = 20f
        }
        setContentView(textView)
    }
}
