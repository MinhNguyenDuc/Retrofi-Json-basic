package com.example.jsonbasic;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIManager {
    String SERVER_URL = "http://tommyprivateguide.com";

    @GET("/data.json")
    Call<NewsModel> getNews();


}
