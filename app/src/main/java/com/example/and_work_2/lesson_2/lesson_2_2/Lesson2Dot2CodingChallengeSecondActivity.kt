package com.example.and_work_2.lesson_2.lesson_2_2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.and_work_2.R

class Lesson2Dot2CodingChallengeSecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_2_dot_2_coding_challenge_second)
    }

    fun chooseItem(view: View) {
        val intent = Intent()
        intent.putExtra(ITEM, (view as Button).text.toString())
        setResult(RESULT_OK, intent)
        finish()
    }

    companion object {
        const val ITEM = "item"
    }
}