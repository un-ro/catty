package com.unero.catty.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Cat(
    var breed: String,
    var thumbnail: Int,
    var photos: Array<Int>,
    var size: String,
    var overview: String,
    var history: String
): Parcelable
