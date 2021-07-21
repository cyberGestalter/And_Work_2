package com.example.and_work_2.lesson_2.lesson_2_1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.and_work_2.R

class Lesson2Dot1FirstActivity : AppCompatActivity() {

    private val LOG_TAG = Lesson2Dot1FirstActivity::class.simpleName
    private lateinit var mMessageEditText: EditText
    private lateinit var mReplyHeadTextView: TextView
    private lateinit var mReplyTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_2_dot_1_first)
        mMessageEditText = findViewById(R.id.editText_main)
        mReplyHeadTextView = findViewById(R.id.text_header_reply)
        mReplyTextView = findViewById(R.id.text_message_reply)
    }

    fun launchSecondActivity(view: View) {
        Log.d(LOG_TAG, getString(R.string.button_clicked));
        val intent = Intent(this, Lesson2Dot1SecondActivity::class.java)
        val message = mMessageEditText.text.toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivityForResult(intent, TEXT_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                val reply = data?.getStringExtra(Lesson2Dot1SecondActivity.EXTRA_REPLY)
                if (reply != null) {
                    mReplyHeadTextView.isVisible = true
                    mReplyTextView.isVisible = true
                    mReplyTextView.text = reply
                }
            }
        }
    }

    companion object {
        const val EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE";
        const val TEXT_REQUEST = 1
    }
}