package com.binar.challengechapter8.network

import com.binar.challengechapter8.data.api.GetAllUserResponseItem
import com.binar.challengechapter8.model.MovieResponse
import com.binar.challengechapter8.data.api.PostUser
import com.binar.challengechapter8.data.api.RequestUser
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiServices {
    @GET("movie/popular")
    fun getMovie(
        @Query("api_key") apiKey: String
    ): Call<MovieResponse>

    @GET("datauserlogin")
    suspend fun getAllUser(): List<GetAllUserResponseItem>

    @POST("datauserlogin")
    fun addNewUser(@Body requestUser: RequestUser): Call<PostUser>
}