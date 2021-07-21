package com.example.and_work_2.lesson_2.lesson_2_2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.and_work_2.R

class Lesson2Dot2CodingChallengeFirstActivity : AppCompatActivity() {
    private val GET_ITEM = 3
    private lateinit var itemList: ListView
    private lateinit var items: MutableList<String>
    private lateinit var adapter: ArrayAdapter<String>

    private val ITEMS = "items"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_2_dot_2_coding_challenge)

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
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putStringArray(ITEMS, items.toTypedArray())
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == GET_ITEM) {
            if (resultCode == RESULT_OK) {
                data?.getStringExtra(Lesson2Dot2CodingChallengeSecondActivity.ITEM)?.let {
                    items.add(it)
                    adapter.notifyDataSetChanged()
                }
            }
        }
    }

    fun addItem(view: View) {
        val intent = Intent(this, Lesson2Dot2CodingChallengeSecondActivity::class.java)
        startActivityForResult(intent, GET_ITEM)
    }
}