package com.example.classifythis

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class QuizResponseFragment(val text : String, val callback : () -> Unit) : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        callback()
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setMessage(text)
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}