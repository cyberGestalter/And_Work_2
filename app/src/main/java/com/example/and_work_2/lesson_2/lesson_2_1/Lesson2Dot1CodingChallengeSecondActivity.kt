package com.example.and_work_2.lesson_2.lesson_2_1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.and_work_2.R

class Lesson2Dot1CodingChallengeSecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_2_dot_1_coding_challenge_second)

        val mTextView: TextView = findViewById(R.id.text_second)
        val intent = intent
        val message = intent
            .getStringExtra(Lesson2Dot1CodingChallengeFirstActivity.EXTRA_MESSAGE)
            ?.repeat(1000)
        mTextView.text = message
    }

    companion object {
        const val TEXT_ONE = "Text one"
        const val TEXT_TWO = "Text two"
        const val TEXT_THREE = "Text three"
    }
}