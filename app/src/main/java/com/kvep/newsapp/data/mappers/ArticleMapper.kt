package com.kvep.newsapp.data.mappers

import com.kvep.newsapp.data.local.NewsArticlesEntity
import com.kvep.newsapp.domain.model.NewsArticles

fun NewsArticlesEntity.toNewsArticles():NewsArticles{
    return NewsArticles(
        author=author,
        content=content,
        description=description,
        publishedAt=publishedAt,
        source=source,
        title=title,
        newsUrl=newsUrl,
        urlToImage=urlToImage
    )
}

fun NewsArticles.toNewsArticleEntity():NewsArticlesEntity{
    return NewsArticlesEntity(
        author=author,
        content=content,
        description=description,
        publishedAt=publishedAt,
        source=source,
        title=title,
        newsUrl=newsUrl,
        urlToImage=urlToImage
    )
}