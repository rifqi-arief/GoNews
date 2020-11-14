package com.example.gonews

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)