package com.example.and_work_2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.and_work_2.lesson_1.lesson_1_1.Lesson1Dot1Activity
import com.example.and_work_2.lesson_1.lesson_1_2.Lesson1Dot2HomeWorkActivity
import com.example.and_work_2.lesson_1.lesson_1_2.Lesson1Dot2PartAActivity
import com.example.and_work_2.lesson_1.lesson_1_2.Lesson1Dot2PartBActivity
import com.example.and_work_2.lesson_1.lesson_1_3.Lesson1Dot3Activity
import com.example.and_work_2.lesson_1.lesson_1_3.Lesson1Dot3HomeWorkActivity
import com.example.and_work_2.lesson_2.lesson_2_1.Lesson2Dot1CodingChallengeFirstActivity
import com.example.and_work_2.lesson_2.lesson_2_1.Lesson2Dot1FirstActivity
import com.example.and_work_2.lesson_2.lesson_2_1.Lesson2Dot1HomeWorkFirstActivity
import com.example.and_work_2.lesson_2.lesson_2_2.Lesson2Dot2CodingChallengeFirstActivity
import com.example.and_work_2.lesson_2.lesson_2_2.Lesson2Dot2FirstActivity
import com.example.and_work_2.lesson_2.lesson_2_2.Lesson2Dot2HomeWorkActivity
import com.example.and_work_2.lesson_2.lesson_2_3.Lesson2Dot3CodingChallengeFirstActivity
import com.example.and_work_2.lesson_2.lesson_2_3.Lesson2Dot3HomeWorkActivity
import com.example.and_work_2.lesson_2.lesson_2_3.Lesson2Dot3ReceiveActivity
import com.example.and_work_2.lesson_2.lesson_2_3.Lesson2Dot3SendActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openLesson1Dot1(view: View) {
        startLesson(Lesson1Dot1Activity::class.java)
    }

    fun openLesson1Dot2A(view: View) {
        startLesson(Lesson1Dot2PartAActivity::class.java)
    }

    fun openLesson1Dot2B(view: View) {
        startLesson(Lesson1Dot2PartBActivity::class.java)
    }

    fun openLesson1Dot2HomeWork(view: View) {
        startLesson(Lesson1Dot2HomeWorkActivity::class.java)
    }

    fun openLesson1Dot3(view: View) {
        startLesson(Lesson1Dot3Activity::class.java)
    }

    fun openLesson1Dot3HomeWork(view: View) {
        startLesson(Lesson1Dot3HomeWorkActivity::class.java)
    }

    fun openLesson2Dot1(view: View) {
        startLesson(Lesson2Dot1FirstActivity::class.java)
    }

    fun openLesson2Dot1CodingChallenge(view: View) {
        startLesson(Lesson2Dot1CodingChallengeFirstActivity::class.java)
    }

    fun openLesson2Dot1HomeWork(view: View) {
        startLesson(Lesson2Dot1HomeWorkFirstActivity::class.java)
    }

    fun openLesson2Dot2(view: View) {
        startLesson(Lesson2Dot2FirstActivity::class.java)
    }

    fun openLesson2Dot2CodingChallenge(view: View) {
        startLesson(Lesson2Dot2CodingChallengeFirstActivity::class.java)
    }

    fun openLesson2Dot2HomeWork(view: View) {
        startLesson(Lesson2Dot2HomeWorkActivity::class.java)
    }

    fun openLesson2Dot3Send(view: View) {
        startLesson(Lesson2Dot3SendActivity::class.java)
    }

    fun openLesson2Dot3Receive(view: View) {
        startLesson(Lesson2Dot3ReceiveActivity::class.java)
    }

    fun openLesson2Dot3CodingChallenge(view: View) {
        startLesson(Lesson2Dot3CodingChallengeFirstActivity::class.java)
    }

    fun openLesson2Dot3HomeWork(view: View) {
        startLesson(Lesson2Dot3HomeWorkActivity::class.java)
    }

    private fun startLesson(clazz: Class<out AppCompatActivity>) {
        val intent = Intent(this, clazz)
        startActivity(intent)
    }
}