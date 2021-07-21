package com.example.and_work_2.lesson_2.lesson_2_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.and_work_2.R

class Lesson2Dot1SecondActivity : AppCompatActivity() {

    private lateinit var mReply: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_2_dot_1_second)

        val intent = intent
        val message = intent.getStringExtra(Lesson2Dot1FirstActivity.EXTRA_MESSAGE)
        val textView: TextView = findViewById(R.id.text_message)
        textView.text = message

        mReply = findViewById(R.id.editText_second)
    }

    fun returnReply(view: View) {
        val reply = mReply.text.toString()
        val replyIntent = Intent()
        replyIntent.putExtra(EXTRA_REPLY, reply)
        setResult(RESULT_OK, replyIntent)
        finish()
    }

    companion object {
        const val EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY";
    }
}