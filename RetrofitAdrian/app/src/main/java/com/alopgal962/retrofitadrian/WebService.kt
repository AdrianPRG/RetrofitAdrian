package com.alopgal962.retrofitadrian

import retrofit2.Response
import retrofit2.http.GET

interface WebService {

    @GET("/titans")
    suspend fun getTitans(): Response<TitanResponse>

}