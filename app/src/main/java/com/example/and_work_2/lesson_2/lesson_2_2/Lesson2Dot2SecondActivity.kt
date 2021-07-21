package com.example.and_work_2.lesson_2.lesson_2_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.and_work_2.R

class Lesson2Dot2SecondActivity : AppCompatActivity() {
    private val LOG_TAG = Lesson2Dot2SecondActivity::class.simpleName

    private lateinit var mReply: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_2_dot_2_second)

        val intent = intent
        val message = intent.getStringExtra(Lesson2Dot2FirstActivity.EXTRA_MESSAGE)
        val textView: TextView = findViewById(R.id.text_message)
        textView.text = message

        mReply = findViewById(R.id.editText_second)

        Log.d(LOG_TAG, getString(R.string.log_comment_underscores))
        Log.d(LOG_TAG, getString(R.string.log_comment_on_create))
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, getString(R.string.log_comment_on_start))
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, getString(R.string.log_comment_on_resume))
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, getString(R.string.log_comment_on_pause))
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, getString(R.string.log_comment_on_stop))
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, getString(R.string.log_comment_on_destroy))
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_TAG, getString(R.string.log_comment_on_restart))
    }

    fun returnReply(view: View) {
        val reply = mReply.text.toString()
        val replyIntent = Intent()
        replyIntent.putExtra(EXTRA_REPLY, reply)
        setResult(RESULT_OK, replyIntent)
        Log.d(LOG_TAG, getString(R.string.end_lesson_2_dot_2_second_activity))
        finish()
    }

    companion object {
        const val EXTRA_REPLY = "com.example.android.twoactivities2.extra.REPLY";
    }
}