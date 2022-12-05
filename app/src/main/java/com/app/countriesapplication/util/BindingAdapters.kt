package com.app.countriesapplication.util

import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("app:hideIfEmpty")
fun hideIfEmpty(view: TextView, str: String) {
    view.visibility = if (str.isEmpty()) View.GONE else View.VISIBLE
}