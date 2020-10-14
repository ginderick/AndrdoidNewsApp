package com.example.andrdoidnewsapp.ui

import androidx.lifecycle.ViewModel
import com.example.andrdoidnewsapp.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
): ViewModel() {
}