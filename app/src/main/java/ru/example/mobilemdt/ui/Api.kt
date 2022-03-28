package ru.example.mobilemdt.ui

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

data class login(val id:String, val email:String, val nickname: String, val avatar:String, val token: String)
data class feelings (val success: Boolean, val data: ArrayList<data_feelings>)
data class data_feelings(val id:Int, val title:String, val image: String, val position: Int)

data class quotes(val success: Boolean, val data: ArrayList<data_quotes>)
data class data_quotes(val id:Int, val title: String, val image: String, val description: String)

interface Api{
    @POST("user/login")
    fun getAuth(@Body hashMap: HashMap<String,String>): Call<login>
    @GET("feelings")
    fun getFeel():Call<feelings>
    @GET("quotes")
    fun getQuotes():Call<quotes>

}
