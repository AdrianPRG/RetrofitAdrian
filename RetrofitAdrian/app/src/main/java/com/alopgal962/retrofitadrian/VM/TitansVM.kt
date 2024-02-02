package com.alopgal962.retrofitadrian.VM

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alopgal962.retrofitadrian.RetrofitCliente
import com.alopgal962.retrofitadrian.Titan
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@SuppressLint("MutableCollectionMutableState")
class TitansVM:ViewModel() {

    var listaTitans:ArrayList<Titan> by mutableStateOf(arrayListOf())


    fun getTitans(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = RetrofitCliente.webService.getTitans()
            withContext(Dispatchers.Main){
                val responsebody  = response.body()
                if (response.isSuccessful) {
                    Log.d("TitansVM", "Respuesta exitosa: ${response.body()}")
                    listaTitans = responsebody?.datos!!
                    Log.d("TitansVM", "Datos de Titans: $listaTitans")
                } else {
                    Log.e("TitansVM", "Error en la respuesta: ${response.message()}")
                }
            }
        }
    }

}