package com.psh.learn.email.data

import androidx.annotation.StringRes

data class Email(
    val id: Int,
    val sender: User,
    val recipients: List<User> = emptyList(),
    @StringRes val subject: Int,
    @StringRes val body: Int,
    var mailboxType: MailboxType = MailboxType.Inbox,
    @StringRes val receivedAt: Int
)
