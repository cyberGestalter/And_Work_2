package com.example.and_work_2.lesson_2.lesson_2_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.and_work_2.R

class Lesson2Dot2HomeWorkActivity : AppCompatActivity() {

    private var mCount: Int = 0
    private lateinit var mShowCount: TextView

    private val COUNT = "count"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_2_dot_2_home_work)

        mShowCount = findViewById(R.id.show_count)
        if (savedInstanceState != null) {
            mCount = savedInstanceState.getInt(COUNT)
            mShowCount.text = mCount.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        if (mCount > 0) {
            outState.putInt(COUNT, mCount)
        }
    }

    fun countUp(view: View) {
        mCount++
        mShowCount.text = mCount.toString()
    }
}