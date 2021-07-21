package com.example.and_work_2.lesson_2.lesson_2_3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.core.app.ShareCompat
import com.example.and_work_2.R

class Lesson2Dot3HomeWorkActivity : AppCompatActivity() {
    private val LOG_TAG = "ImplicitIntents"
    private lateinit var mWebsiteEditText: EditText
    private lateinit var mLocationEditText: EditText
    private lateinit var mShareTextEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_2_dot_3_home_work)

        mWebsiteEditText = findViewById(R.id.website_edittext)
        mLocationEditText = findViewById(R.id.location_edittext)
        mShareTextEditText = findViewById(R.id.share_edittext)
    }

    fun openWebsite(view: View) {
        val url = mWebsiteEditText.text.toString()
        val webPage = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webPage)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Log.d(LOG_TAG, getString(R.string.can_not_handle))
        }
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

    fun shareText(view: View) {
        val txt = mShareTextEditText.text.toString()
        val mimeType = "text/plain"
        ShareCompat.IntentBuilder
            .from(this)
            .setType(mimeType)
            .setChooserTitle(getString(R.string.share_text))
            .setText(txt)
            .startChooser()
    }

    fun takeAPicture(view: View) {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Log.d(LOG_TAG, getString(R.string.can_not_handle))
        }
    }
}