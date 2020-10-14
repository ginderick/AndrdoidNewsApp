package com.example.andrdoidnewsapp.models

import com.example.andrdoidnewsapp.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)