package com.example.view_onconfigrationchange_issue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<View>(R.id.button)
        button.setOnClickListener {
            MyDialogFragment().show(supportFragmentManager, "mydialog")
        }
    }
}