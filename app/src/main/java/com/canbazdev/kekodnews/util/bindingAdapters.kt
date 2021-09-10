package com.canbazdev.kekodnews.util

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.canbazdev.kekodnews.R

object ImageBindingAdapter {
    @JvmStatic
    @BindingAdapter("sourceImage")
    fun <T> loadImage(view: ImageView, profileImage: T) {
        Glide.with(view.context)
            .load(profileImage)
            .into(view)

    }
}