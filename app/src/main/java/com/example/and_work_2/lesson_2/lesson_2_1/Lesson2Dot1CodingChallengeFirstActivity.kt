package com.example.and_work_2.lesson_2.lesson_2_1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.and_work_2.R

class Lesson2Dot1CodingChallengeFirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_2_dot_1_coding_challenge_first)
    }

    fun openTextOne(view: View) {
        openText(Lesson2Dot1CodingChallengeSecondActivity.TEXT_ONE)
    }

    fun openTextTwo(view: View) {
        openText(Lesson2Dot1CodingChallengeSecondActivity.TEXT_TWO)
    }

    fun openTextThree(view: View) {
        openText(Lesson2Dot1CodingChallengeSecondActivity.TEXT_THREE)
    }

    private fun openText(message: String) {
        val intent = Intent(this, Lesson2Dot1CodingChallengeSecondActivity::class.java)
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }

    companion object {
        const val EXTRA_MESSAGE = "extra_message"
    }
}