package com.kvep.newsapp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NewsArticlesEntity(
    val author: String,

    val content: String,

    val description: String,

    val publishedAt: String,

    val source: String,

    val title: String,

    val newsUrl: String,

    val urlToImage: String,
    @PrimaryKey
    val id:Int?=null

)
