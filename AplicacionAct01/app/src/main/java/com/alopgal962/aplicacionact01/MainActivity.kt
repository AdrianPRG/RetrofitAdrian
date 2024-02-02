package com.alopgal962.aplicacionact01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //SE CREAN AQUI LAS VARIABLES DE LA SEGUNDA FUNCION
    //SE INICIALIZARAN EN LA SEGUNDA FUNCION
    lateinit var boton2:Button
    lateinit var texto2:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //PRIMERA FUNCION

        /*
        fun manera1(){

            //VARIABLES CONECTADAS CON ID
            //SE DECLARAN NADA MAS CREARLAS

            var texto:TextView=findViewById(R.id.texto_inicio)
            var boton:Button=findViewById(R.id.boton_pulsar)

            //VARIABLES NECESARIAS

            var contador=0
            var valortextomenora5=24
            var valortextomayora5=22

            //POR CADA CLICK SE SUMA 1
            //SE COMPRUEBAN LAS CONDICIONES

            boton.setOnClickListener {
                contador++
                //SE COMPRUEBA LA CUENTA
                if (contador==1){
                    texto.setText("Has hecho click una vez")
                    texto.setTextSize(valortextomenora5.toFloat())
                }
                else if (contador==2){
                    texto.setText("Has hecho click dos veces")
                }
                else if (contador>=3 && contador<=5){
                    texto.setText("Has hecho click $contador veces")
                }
                else if (contador>5 && contador<10){
                    texto.setText("Has hecho click varias veces ($contador)!")
                    texto.setTextSize(valortextomayora5.toFloat())
                }
                else if (contador>=10){
                    texto.setText("Te has pasado con los clicks!")
                    boton.setEnabled(false)
                    Toast.makeText(this, "El boton ha sido deshabilitado", Toast.LENGTH_SHORT).show()
                }
            }
        }

        manera1()

         */

        //SEGUNDA FUNCION

        fun manera2(){

            //SE INICIALIZAN AQUI LAS VARIABLES
            texto2 = findViewById(R.id.texto_inicio)
            boton2 = findViewById(R.id.boton_pulsar)
            var contador2=0
            var tamanomenor5_manera2=24
            var tamanomayor5_manera2=22

            //POR CADA CLICK SE SUMA 1 AL NUEVO CONTADOR
            //DE NUEVO SE COMPRUEBAN LAS CONDICIONES

            boton2.setOnClickListener {
                contador2++
                //SE COMPRUEBA LA CUENTA DE IGUAL MANERA
                if (contador2==1){
                    texto2.setText("Has hecho click una vez")
                    texto2.setTextSize(tamanomenor5_manera2.toFloat())
                }
                else if (contador2==2){
                    texto2.setText("Has hecho click dos veces")
                }
                else if (contador2>=3 && contador2<=5){
                    texto2.setText("Has hecho click $contador2 veces")
                }
                else if (contador2>5 && contador2<10){
                    texto2.setText("Has hecho click varias veces ($contador2)!")
                    texto2.setTextSize(tamanomayor5_manera2.toFloat())
                }
                else if (contador2>=10){
                    texto2.setText("Te has pasado con los clicks!")
                    boton2.setEnabled(false)
                    Toast.makeText(this, "El boton ha sido deshabilitado", Toast.LENGTH_SHORT).show()
                }
            }
        }

        manera2()



    }
}