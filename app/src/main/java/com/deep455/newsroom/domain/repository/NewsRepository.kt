package com.deep455.newsroom.domain.repository

import com.deep455.newsroom.domain.model.Article
import com.deep455.newsroom.util.Resource

interface NewsRepository {

    suspend fun getTopHeadlines(
        category: String
    ): Resource<List<Article>>

    suspend fun searchForNews(
        query: String
    ): Resource<List<Article>>

}