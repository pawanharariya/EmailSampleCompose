package com.psh.learn.email.ui

import androidx.lifecycle.ViewModel
import com.psh.learn.email.data.Email
import com.psh.learn.email.data.MailboxType
import com.psh.learn.email.data.local.EmailDataSource
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class EmailViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(EmailUiState())
    val uiState = _uiState.asStateFlow()

    private fun initializeUiState() {
        val mailboxes: Map<MailboxType, List<Email>> =
            EmailDataSource.allEmails.groupBy { it.mailboxType }
        _uiState.value = EmailUiState(
            mailboxes = mailboxes,
            selectedEmail = mailboxes[MailboxType.Inbox]?.get(0) ?: EmailDataSource.defaultEmail
        )
    }

    fun updateDetailsScreenStates(email: Email) {
        _uiState.update {
            it.copy(
                selectedEmail = email,
                isShowingHomepage = false
            )
        }
    }

    fun resetHomeScreenStates() {
        _uiState.update {
            it.copy(
                selectedEmail = it.mailboxes[it.currentMailbox]?.get(0)
                    ?: EmailDataSource.defaultEmail,
                isShowingHomepage = true
            )
        }
    }

    fun updateCurrentMailbox(mailboxType: MailboxType) {
        _uiState.update {
            it.copy(
                currentMailbox = mailboxType
            )
        }
    }
}