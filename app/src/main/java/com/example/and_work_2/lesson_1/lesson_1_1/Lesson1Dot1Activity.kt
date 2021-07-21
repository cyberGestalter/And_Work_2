package com.example.and_work_2.lesson_1.lesson_1_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.and_work_2.R
import java.lang.NumberFormatException

class Lesson1Dot1Activity : AppCompatActivity() {

    private val LOG_TAG = Lesson1Dot1Activity::class.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_1_dot_1)

        logADebugMsg()
        logAnErrorMsg()
    }

    private fun logADebugMsg() {
        Log.d(LOG_TAG, getString(R.string.hello_world))
    }

    private fun logAnErrorMsg() {
        try {
            getString(R.string.hello_world).toInt()
        } catch (e: NumberFormatException) {
            Log.e(LOG_TAG, NumberFormatException::class.java.simpleName)
        }
    }
}