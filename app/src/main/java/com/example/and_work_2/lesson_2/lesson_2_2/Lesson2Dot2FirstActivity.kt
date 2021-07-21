package com.example.and_work_2.lesson_2.lesson_2_2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.and_work_2.R

class Lesson2Dot2FirstActivity : AppCompatActivity() {
    private val LOG_TAG = Lesson2Dot2FirstActivity::class.simpleName
    private lateinit var mMessageEditText: EditText
    private lateinit var mReplyHeadTextView: TextView
    private lateinit var mReplyTextView: TextView

    private val REPLY_VISIBLE = "reply_visible"
    private val REPLY_TEXT = "reply_text"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_2_dot_2_first)
        mMessageEditText = findViewById(R.id.editText_main)
        mReplyHeadTextView = findViewById(R.id.text_header_reply)
        mReplyTextView = findViewById(R.id.text_message_reply)

        if (savedInstanceState?.getBoolean(REPLY_VISIBLE) == true) {
            mReplyHeadTextView.visibility = View.VISIBLE
            mReplyTextView.visibility = View.VISIBLE
            mReplyTextView.text = savedInstanceState.getString(REPLY_TEXT)
        }

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

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        if (mReplyHeadTextView.visibility == View.VISIBLE) {
            outState.putBoolean(REPLY_VISIBLE, true)
            outState.putString(REPLY_TEXT, mReplyTextView.text.toString())
        }
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

    fun launchSecondActivity(view: View) {
        Log.d(LOG_TAG, getString(R.string.button_clicked));
        val intent = Intent(this, Lesson2Dot2SecondActivity::class.java)
        val message = mMessageEditText.text.toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivityForResult(intent, TEXT_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                val reply = data?.getStringExtra(Lesson2Dot2SecondActivity.EXTRA_REPLY)
                if (reply != null) {
                    mReplyHeadTextView.isVisible = true
                    mReplyTextView.isVisible = true
                    mReplyTextView.text = reply
                }
            }
        }
    }

    companion object {
        const val EXTRA_MESSAGE = "com.example.android.twoactivities2.extra.MESSAGE";
        const val TEXT_REQUEST = 2
    }
}