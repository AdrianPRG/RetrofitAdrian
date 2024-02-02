package com.alopgal962.calculadoraadri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    class Calculo{
        var num1=0
        var num2=0
        var operacion=""
        var resultado=""
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}