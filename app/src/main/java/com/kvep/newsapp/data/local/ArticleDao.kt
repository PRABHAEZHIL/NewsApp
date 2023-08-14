package com.kvep.newsapp.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ArticleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: NewsArticlesEntity): Long
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNewsArticles(newsArticlesEntity: List<NewsArticlesEntity>)

    @Query("SELECT * FROM NewsArticlesEntity")
    fun getAllArticles(): LiveData<List<NewsArticlesEntity>>

    @Delete
    suspend fun deleteArticle(article: NewsArticlesEntity)


}