package com.igti.retrofit.data.remote;

public class ApiUtils {

    public static final String URL_BASE = "https://jsonplaceholder.typicode.com/";

    public static PostService getPostService(){
        return RetrofitClient.getClient(URL_BASE).create(PostService.class);
    }

}
