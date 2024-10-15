package com.deep455.newsroom.util

//Resource class will help us in keeping the error message and the success data

sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T?): Resource<T>(data = data)
    class Error<T>(message: String?): Resource<T>(message = message)
}