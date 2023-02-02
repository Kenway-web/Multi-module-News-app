package com.example.news_data.network


import com.example.common_utils.Constants
import com.example.news_data.model.NewsResponse

import retrofit2.http.GET
import retrofit2.http.Query


interface NewsApiService {

    //https://newsapi.org/v2/everything?q=apple&from=2023-01-21&to=2023-01-21&sortBy=popularity&apiKey=0c059dff69724402917f4c0c70a5a628


    @GET("top-headlines")
    suspend fun getNewsArticles(

        @Query("country") country:String,
        @Query("category") category:String=Constants.CATEGORY,
        @Query("apiKey") apiKey:String=Constants.API_KEY,


    ):NewsResponse

}