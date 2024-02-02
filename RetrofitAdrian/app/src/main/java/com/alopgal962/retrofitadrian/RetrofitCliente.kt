package com.alopgal962.retrofitadrian

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitCliente {
    val webService: WebService by lazy {
        Retrofit.Builder()
            .baseUrl(Constantes.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()) // Agrega el convertidor Gson
            .client(OkHttpClient.Builder().build()) // Agrega el cliente HTTP (puedes personalizarlo según tus necesidades)
            .build()
            .create(WebService::class.java)
    }
}