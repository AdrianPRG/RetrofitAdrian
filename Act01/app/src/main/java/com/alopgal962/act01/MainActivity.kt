package com.alopgal962.act01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {


    var texto=findViewById<TextView>(R.id.texto_inicio)
    var boton=findViewById<Button>(R.id.boton_pulsar)
    var contador=0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton.setOnClickListener {
            Log.d("Boton","Se ha hecho click al Boton")
            contador+=1
        }

    }



}