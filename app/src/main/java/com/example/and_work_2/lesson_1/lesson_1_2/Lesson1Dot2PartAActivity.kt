package com.example.and_work_2.lesson_1.lesson_1_2

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.and_work_2.R

class Lesson1Dot2PartAActivity : AppCompatActivity() {

    private var mCount: Int = 0
    private lateinit var mShowCount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_1_dot_2_part_a)

        mShowCount = findViewById(R.id.show_count)
    }

    fun showToast(view: View) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show()
    }

    fun countUp(view: View) {
        mCount++
        mShowCount.text = mCount.toString()
    }
}