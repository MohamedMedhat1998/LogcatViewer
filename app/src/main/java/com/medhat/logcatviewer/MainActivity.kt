package com.medhat.logcatviewer

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.medhat.logviewer.showLogs

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv = findViewById<TextView>(R.id.textView2)
        findViewById<Button>(R.id.button).setOnClickListener {
            showLogs(tv)
            getString(R.string.logPlaceholder)
        }
    }
}