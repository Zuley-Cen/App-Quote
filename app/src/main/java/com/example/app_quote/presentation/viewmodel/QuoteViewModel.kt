package com.example.app_quote.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.app_quote.data.QuoteProvider
import com.example.app_quote.domain.model.QuoteModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class QuoteViewModel: ViewModel() {
    private val _quoteModel = MutableStateFlow(QuoteModel("",""))
    val quoteModel: StateFlow<QuoteModel> = _quoteModel

    //---  Load data from a suspend fun and mutate state
    fun randomQuote() {
        viewModelScope.launch {
            val quote= QuoteProvider.random()
            _quoteModel.value = quote
        }
    }
}