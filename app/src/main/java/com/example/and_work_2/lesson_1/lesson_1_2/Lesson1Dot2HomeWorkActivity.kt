package com.example.and_work_2.lesson_1.lesson_1_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.and_work_2.R

class Lesson1Dot2HomeWorkActivity : AppCompatActivity() {

    private var mCount: Int = 0
    private lateinit var mShowCount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_1_dot_2_home_work)

        mShowCount = findViewById(R.id.show_count)
    }

    fun showToast(view: View) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show()
    }

    fun countUp(view: View) {
        mCount++
        mShowCount.text = mCount.toString()

        val color = if (mCount % 2 == 0) R.color.even_color else R.color.odd_color
        changeViewBackgroundColor(view, color)
        val zeroButton: Button = findViewById(R.id.button_zero)
        changeViewBackgroundColor(zeroButton, R.color.active_zero_button)
    }

    fun countToZero(view: View) {
        mCount = 0
        mShowCount.text = mCount.toString()

        changeViewBackgroundColor(view, R.color.grey)
        val countButton: Button = findViewById(R.id.button_count)
        changeViewBackgroundColor(countButton, R.color.purple_500)
    }

    private fun changeViewBackgroundColor(view: View, color: Int) {
        view.setBackgroundColor(ContextCompat.getColor(this, color))
    }
}