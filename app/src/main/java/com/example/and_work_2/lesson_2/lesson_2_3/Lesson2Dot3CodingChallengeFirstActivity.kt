package com.example.and_work_2.lesson_2.lesson_2_3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import com.example.and_work_2.R
import com.example.and_work_2.lesson_2.lesson_2_2.Lesson2Dot2CodingChallengeSecondActivity

class Lesson2Dot3CodingChallengeFirstActivity : AppCompatActivity() {
    private val GET_ITEM = 3
    private val LOG_TAG = Lesson2Dot3CodingChallengeFirstActivity::class.java.simpleName
    private lateinit var itemList: ListView
    private lateinit var items: MutableList<String>
    private lateinit var adapter: ArrayAdapter<String>
    private lateinit var mLocationEditText: EditText

    private val ITEMS = "items"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_2_dot_3_coding_challenge_first)

        val savedItems = savedInstanceState?.getStringArray(ITEMS)
        items = mutableListOf()
        if (savedItems != null) {
            for (item in savedItems) {
                items.add(item)
            }
        }

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
        itemList = findViewById(R.id.item_list)
        itemList.adapter = adapter

        mLocationEditText = findViewById(R.id.editTextText_loc)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putStringArray(ITEMS, items.toTypedArray())
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == GET_ITEM) {
            if (resultCode == RESULT_OK) {
                data?.getStringExtra(Lesson2Dot3CodingChallengeSecondActivity.ITEM)?.let {
                    items.add(it)
                    adapter.notifyDataSetChanged()
                }
            }
        }
    }

    fun addItem(view: View) {
        val intent = Intent(this, Lesson2Dot3CodingChallengeSecondActivity::class.java)
        startActivityForResult(intent, GET_ITEM)
    }

    fun openLocation(view: View) {
        val loc = mLocationEditText.text.toString()
        val addressUri = Uri.parse("${getString(R.string.geo_suffix)}$loc")
        val intent = Intent(Intent.ACTION_VIEW, addressUri)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Log.d(LOG_TAG, getString(R.string.can_not_handle))
        }
    }
}