package com.psh.learn.email.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class User(
    val id: Int,
    @StringRes val firstName: Int,
    @StringRes val lastName: Int,
    @StringRes val email: Int,
    @DrawableRes val avatar: Int
)
