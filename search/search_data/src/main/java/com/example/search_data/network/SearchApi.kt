package com.example.search_data.network

import com.example.search_data.model.NewsResponse
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface SearchApi {


//    https://newsapi.org/v2/everything?q=apple&from=2023-02-03&to=2023-02-03&sortBy=popularity&apiKey=0c059dff69724402917f4c0c70a5a628

    @GET("everything")
    suspend fun getSearchArticles(
        @QueryMap map:MutableMap<String,String>
    ):NewsResponse

}