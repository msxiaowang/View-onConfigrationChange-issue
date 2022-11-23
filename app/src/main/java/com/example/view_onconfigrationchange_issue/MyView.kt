package com.example.view_onconfigrationchange_issue

import android.content.Context
import android.content.res.Configuration
import android.util.AttributeSet
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MyView @JvmOverloads constructor(
    context: Context,
    attr: AttributeSet? = null,
    style: Int = 0
): LinearLayout(context, attr, style) {
    private val textView = TextView(context)

    init {
        textView.gravity = Gravity.CENTER
        addView(textView, LayoutParams(LayoutParams.MATCH_PARENT, 300))
        textView.text = if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) "Landscape" else "Portrait"
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        textView.text = if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) "Landscape" else "Portrait"
    }
}