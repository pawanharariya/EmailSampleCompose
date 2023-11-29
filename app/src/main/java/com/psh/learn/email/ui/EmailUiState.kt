package com.psh.learn.email.ui

import com.psh.learn.email.data.Email
import com.psh.learn.email.data.MailboxType
import com.psh.learn.email.data.local.EmailDataSource

data class EmailUiState(
    val mailboxes: Map<MailboxType, List<Email>> = emptyMap(),
    val currentMailbox: MailboxType = MailboxType.Inbox,
    val selectedEmail: Email = EmailDataSource.defaultEmail,
    val isShowingHomepage: Boolean = true
) {
    val currentMailBoxEmails: List<Email> by lazy { mailboxes[currentMailbox]!! }
}