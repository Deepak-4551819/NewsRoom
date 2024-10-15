package com.deep455.newsroom.data.repository

import com.deep455.newsroom.data.remote.NewsApi
import com.deep455.newsroom.domain.model.Article
import com.deep455.newsroom.domain.repository.NewsRepository
import com.deep455.newsroom.util.Resource

//ctrl + I for override methods

class NewsRepositoryImpl(
    private val newsApi: NewsApi
) : NewsRepository {
    override suspend fun getTopHeadlines(category: String): Resource<List<Article>> {
        return try {
            val response = newsApi.getBreakingNews(category = category)
            Resource.Success(response.articles)
        } catch (e: Exception) {
            Resource.Error(message = "Failed to fetch news ${e.message}")

        }
    }

    override suspend fun searchForNews(query: String): Resource<List<Article>> {
        return try {
            val response = newsApi.searchForNews(query = query)
            Resource.Success(response.articles)
        } catch (e: Exception) {
            Resource.Error(message = "Failed to fetch news ${e.message}")

        }
    }
}