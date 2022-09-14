package by.zharikov.newsapp.data.api

import by.zharikov.newsapp.models.NewsResponse
import by.zharikov.newsapp.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {

    @GET("/v2/everything")
    suspend fun getEverything(
        @Query("q") query: String,
        @Query("page") page: Int = 1,
        @Query("apiKey") apiKey: String = Constants.API_KEY
    ) : Response<NewsResponse>

    @GET("/v2/top-headlines")
    suspend fun getTopHeadLines(
        @Query("country") country: String = "ru",
        @Query("page") page: Int = 1,
        @Query("apiKey") apiKey: String = Constants.API_KEY
    ) : Response<NewsResponse>
}