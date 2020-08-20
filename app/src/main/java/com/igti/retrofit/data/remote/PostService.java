package com.igti.retrofit.data.remote;

import com.igti.retrofit.data.model.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostService {

    @GET("posts")
    Call<List<Posts>> getPosts();

}
