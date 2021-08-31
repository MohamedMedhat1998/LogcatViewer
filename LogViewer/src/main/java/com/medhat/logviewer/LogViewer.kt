package com.medhat.logviewer

import android.content.Context
import android.widget.TextView
import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Displays the android logs to the target [TextView].
 * @param target The [TextView] to display the logs into.
 */
fun Context.showLogs(target: TextView) {
    val process = Runtime.getRuntime().exec("logcat -d")
    val inputStreamReader = InputStreamReader(process.inputStream)
    val bufferedReader = BufferedReader(inputStreamReader)
    var line = bufferedReader.readLine()
    while (line != null) {
        target.text = this.getString(R.string.logPlaceholder, target.text, line)
        line = bufferedReader.readLine()
    }
}