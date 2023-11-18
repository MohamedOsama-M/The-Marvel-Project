package com.example.themarvelproject.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Movie (
    @StringRes val movieName: Int,
    @StringRes val dateRes: Int,
    @DrawableRes val posterRes: Int
)