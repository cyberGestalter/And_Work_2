package com.example.and_work_2.lesson_2.lesson_2_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.and_work_2.R

class Lesson2Dot3ReceiveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_2_dot_3_receive)

        val uri = intent.data
        if (uri != null) {
            val uriString = "${getString(R.string.uri_label)} $uri"
            val textView: TextView = findViewById(R.id.text_uri_message)
            textView.text = uriString
        }
    }
}