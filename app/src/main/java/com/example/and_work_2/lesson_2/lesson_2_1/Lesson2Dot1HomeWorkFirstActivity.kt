package com.example.and_work_2.lesson_2.lesson_2_1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.and_work_2.R

class Lesson2Dot1HomeWorkFirstActivity : AppCompatActivity() {
    private var mCount: Int = 0
    private lateinit var mShowCount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_2_dot_1_home_work_first)
        mShowCount = findViewById(R.id.show_count_number)
    }

    fun sayHello(view: View) {
        val intent = Intent(this, Lesson2Dot1HomeWorkSecondActivity::class.java)
        intent.putExtra(EXTRA_COUNT, mCount)
        startActivity(intent)
    }

    fun countUp(view: View) {
        mCount++
        mShowCount.text = mCount.toString()
    }

    companion object {
        const val EXTRA_COUNT = "extra_count"
    }
}