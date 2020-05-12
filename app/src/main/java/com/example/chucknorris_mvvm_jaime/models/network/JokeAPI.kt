package com.example.chucknorris_mvvm_jaime.models.network

import com.example.chucknorris_mvvm_jaime.models.JokeResponseModel
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface JokeAPI {

    @GET("jokes/random")
    fun getRandomJoke() : Call<JokeResponseModel>
    @GET("jokes/random")
    fun getRandomJokeParam(
        @Query("firstName") firstParam : String,
        @Query("lastName") second: String)
    @GET("jokes/random/{input}")
    fun getRandomListJokeInput(
        @Path("input") input: Int
    )

    companion object{
        fun initRetrofit() : JokeAPI{
            return Retrofit.Builder()
                .baseUrl("http://api.icndb.com/")
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
                .create(JokeAPI::class.java)
        }
    }
}