package com.makentoshe.activityevents

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val textview by lazy {
        findViewById<TextView>(com.makentoshe.activityevents.R.id.textview)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview.text = savedInstanceState?.getString(String::class.java.simpleName)

        val text = "onCreate"
        textview.text = "${textview.text}\n$text"
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        val text = "onPostCreate"
        textview.text = "${textview.text}\n$text"
    }

    override fun onStart() {
        super.onStart()
        val text = "onStart"
        textview.text = "${textview.text}\n$text"
    }

    override fun onPause() {
        super.onPause()
        val text = "onPause"
        textview.text = "${textview.text}\n$text"
    }

    override fun onResume() {
        super.onResume()
        val text = "onResume"
        textview.text = "${textview.text}\n$text"
    }

    override fun onPostResume() {
        super.onPostResume()
        val text = "onPostResume"
        textview.text = "${textview.text}\n$text"
    }

    override fun onStop() {
        super.onStop()
        val text = "onStop"
        textview.text = "${textview.text}\n$text"
    }

    override fun onDestroy() {
        super.onDestroy()
        val text = "onDestroy"
        textview.text = "${textview.text}\n$text"
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        val text = "onAttachedToWindow"
        textview.text = "${textview.text}\n$text"
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        val text = "onDetachedFromWindow"
        textview.text = "${textview.text}\n$text"
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        val text = "onRestoreInstanceState"
        textview.text = "${textview.text}\n$text"
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        val text = "onSaveInstanceState"
        textview.text = "${textview.text}\n$text"
        outState?.putString(String::class.java.simpleName, textview.text.toString())
    }

    override fun onBackPressed() {
//        super.onBackPressed()
        val text = "onBackPressed"
        textview.text = "${textview.text}\n$text"
    }

}
