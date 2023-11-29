package com.psh.learn.email.data.local

import com.psh.learn.email.R
import com.psh.learn.email.data.Email
import com.psh.learn.email.data.MailboxType

object EmailDataSource {

    val defaultEmail = Email(
        id = -1,
        sender = UserDataSource.defaultUser,
        body = -1,
        subject = -1,
        receivedAt = -1
    )

    val allEmails = listOf(
        Email(
            id = 0,
            sender = UserDataSource.getUserById(9),
            recipients = listOf(UserDataSource.defaultUser),
            subject = R.string.email_0_subject,
            body = R.string.email_0_body,
            receivedAt = R.string.email_0_time,
        ),
        Email(
            id = 1,
            sender = UserDataSource.getUserById(6),
            recipients = listOf(UserDataSource.defaultUser),
            subject = R.string.email_1_subject,
            body = R.string.email_1_body,
            receivedAt = R.string.email_1_time,
        ),
        Email(
            2,
            UserDataSource.getUserById(5),
            listOf(UserDataSource.defaultUser),
            subject = R.string.email_2_subject,
            body = R.string.email_2_body,
            receivedAt = R.string.email_2_time,
        ),
        Email(
            3,
            UserDataSource.getUserById(8),
            listOf(UserDataSource.defaultUser),
            subject = R.string.email_3_subject,
            body = R.string.email_3_body,
            receivedAt = R.string.email_3_time,
            mailboxType = MailboxType.Sent,
        ),
        Email(
            id = 4,
            sender = UserDataSource.getUserById(11),
            subject = R.string.email_4_subject,
            body = R.string.email_4_body,
            receivedAt = R.string.email_4_time,
        ),
        Email(
            id = 5,
            sender = UserDataSource.getUserById(13),
            recipients = listOf(UserDataSource.defaultUser),
            subject = R.string.email_5_subject,
            body = R.string.email_5_body,
            receivedAt = R.string.email_5_time,
        ),
        Email(
            id = 6,
            sender = UserDataSource.getUserById(10),
            recipients = listOf(UserDataSource.defaultUser),
            subject = R.string.email_6_subject,
            body = R.string.email_6_body,
            receivedAt = R.string.email_6_time,
            mailboxType = MailboxType.Sent,
        ),
        Email(
            id = 7,
            sender = UserDataSource.getUserById(9),
            recipients = listOf(UserDataSource.defaultUser),
            subject = R.string.email_7_subject,
            body = R.string.email_7_body,
            receivedAt = R.string.email_7_time,
        ),
        Email(
            id = 8,
            sender = UserDataSource.getUserById(13),
            recipients = listOf(UserDataSource.defaultUser),
            subject = R.string.email_8_subject,
            body = R.string.email_8_body,
            receivedAt = R.string.email_8_time,
        ),
        Email(
            id = 9,
            sender = UserDataSource.getUserById(10),
            recipients = listOf(UserDataSource.defaultUser),
            subject = R.string.email_9_subject,
            body = R.string.email_9_body,
            receivedAt = R.string.email_9_time,
            mailboxType = MailboxType.Draft,
        ),
        Email(
            id = 10,
            sender = UserDataSource.getUserById(5),
            recipients = listOf(UserDataSource.defaultUser),
            subject = R.string.email_10_subject,
            body = R.string.email_10_body,
            receivedAt = R.string.email_10_time,
        ),
        Email(
            id = 11,
            sender = UserDataSource.getUserById(5),
            recipients = listOf(UserDataSource.defaultUser),
            subject = R.string.email_11_subject,
            body = R.string.email_11_body,
            receivedAt = R.string.email_11_time,
            mailboxType = MailboxType.Spam,
        )
    )

    /**
     * Returns [Email] with the given [id].
     */
    fun get(id: Int): Email? {
        return allEmails.firstOrNull { it.id == id }
    }
}