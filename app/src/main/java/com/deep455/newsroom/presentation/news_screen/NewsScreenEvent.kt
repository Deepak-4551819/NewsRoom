package com.deep455.newsroom.presentation.news_screen

import com.deep455.newsroom.domain.model.Article

sealed class NewsScreenEvent {
    data class OnNewsCardClicked(val article: Article) : NewsScreenEvent()
    data class OnCategoryChanged(val category: String) : NewsScreenEvent()
    data class OnSearchQueryChange(val searchQuery: String) : NewsScreenEvent()
    object OnSearchIconClicked : NewsScreenEvent() //not need any value form the user
    object OnCloseIconClicked : NewsScreenEvent()
}