package com.psh.learn.email.data.local

import com.psh.learn.email.R
import com.psh.learn.email.data.User

object UserDataSource {

    val defaultUser = User(-1, -1, -1, -1, R.drawable.avatar9)

    val currentUser = User(
        9,
        R.string.user_9_first_name,
        R.string.user_9_last_name,
        R.string.user_9_email_name,
        R.drawable.avatar9
    )

    val otherUsers = listOf(
        User(
            1,
            R.string.user_1_first_name,
            R.string.user_1_last_name,
            R.string.user_1_email_name,
            R.drawable.avatar1
        ),
        User(
            1,
            R.string.user_2_first_name,
            R.string.user_2_last_name,
            R.string.user_2_email_name,
            R.drawable.avatar2
        ),
        User(
            1,
            R.string.user_3_first_name,
            R.string.user_3_last_name,
            R.string.user_3_email_name,
            R.drawable.avatar3
        ),
        User(
            1,
            R.string.user_4_first_name,
            R.string.user_4_last_name,
            R.string.user_4_email_name,
            R.drawable.avatar4
        ),
        User(
            1,
            R.string.user_5_first_name,
            R.string.user_5_last_name,
            R.string.user_5_email_name,
            R.drawable.avatar5
        ),
        User(
            1,
            R.string.user_6_first_name,
            R.string.user_6_last_name,
            R.string.user_6_email_name,
            R.drawable.avatar6
        ),
        User(
            1,
            R.string.user_7_first_name,
            R.string.user_7_last_name,
            R.string.user_7_email_name,
            R.drawable.avatar7
        ),
        User(
            1,
            R.string.user_8_first_name,
            R.string.user_8_last_name,
            R.string.user_8_email_name,
            R.drawable.avatar8
        )
    )

    /**
     * Returns the [User] with given [userId]
     */
    fun getUserById(userId: Int): User {
        return otherUsers.firstOrNull { it.id == userId } ?: otherUsers.first()
    }
}