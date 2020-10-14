package com.example.andrdoidnewsapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.andrdoidnewsapp.R
import com.example.andrdoidnewsapp.ui.NewsActivity
import com.example.andrdoidnewsapp.ui.NewsViewModel

class ArticleFragment: Fragment(R.layout.fragment_article) {


    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }
}