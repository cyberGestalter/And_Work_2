package com.example.and_work_2.lesson_2.lesson_2_1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.and_work_2.R

class Lesson2Dot1HomeWorkSecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_2_dot_1_home_work_second)

        val mShowCount: TextView = findViewById(R.id.count_number)
        val intent = intent
        val count = intent.getIntExtra(Lesson2Dot1HomeWorkFirstActivity.EXTRA_COUNT, 0)
        mShowCount.text = count.toString()
    }
}