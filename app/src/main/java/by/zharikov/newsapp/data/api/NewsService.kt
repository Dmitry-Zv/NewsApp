package by.zharikov.newsapp.data.api

import by.zharikov.newsapp.utils.Constants
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {

    @GET("/v2/everything")
    suspend fun getEverything(
        @Query("q") query: String,
        @Query("page") page: Int = 1,
        @Query("apiKey") apiKey: String = Constants.API_KEY
    )

    @GET("/v2/top-headlines")
    suspend fun getTopHeadLines(
        @Query("country") country: String = "ru",
        @Query("page") page: Int = 1,
        @Query("apiKey") apiKey: String = Constants.API_KEY
    )
}