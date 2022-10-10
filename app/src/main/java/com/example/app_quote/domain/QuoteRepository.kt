package com.example.app_quote.domain

import com.example.app_quote.domain.model.QuoteModel
import kotlinx.coroutines.flow.Flow

interface QuoteRepository {
    // suspend fun getQuotes(): Flow<QuoteResponse?>
    suspend fun getQuoteRandom(): Flow<QuoteModel>
    suspend fun getQuote(quoteId:Int): Flow<QuoteModel>
    //suspend fun editQuote(quoteModel: QuoteModel, token:String): Flow<QuoteResponse?>
    // suspend fun addQuote(quoteModel: QuoteModel, token:String): Flow<QuoteResponse?>
}