package com.alopgal962.retrofitadrian

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alopgal962.retrofitadrian.VM.TitansVM
import com.alopgal962.retrofitadrian.ui.theme.RetrofitAdrianTheme

class MainActivity : ComponentActivity() {

    val viewmodeltitan by viewModels<TitansVM>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RetrofitAdrianTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(modifier = Modifier.fillMaxSize()){
                        DisposableEffect(Unit){
                            viewmodeltitan.getTitans()
                            onDispose {  }
                        }
                        Mostrartodo(listatitans = viewmodeltitan.listaTitans, viewmodel = viewmodeltitan )

                    }
                }
            }
        }
    }
}

@Composable
fun Mostrartodo(listatitans:ArrayList<Titan>, viewmodel:TitansVM){
    Column(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()
        .padding(12.dp)) {
        Column(modifier = Modifier.fillMaxWidth()) {
            LazyColumn(contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)){
                items(listatitans) { titan ->
                    CardTitan(titan = titan)
                }
            }
        }

    }
}

@Composable
fun CardTitan(titan: Titan){
    Column(Modifier.fillMaxSize()) {
        Text(text = "ID de titan ${titan.id}" )
        Text(text = "Nombre de titan ${titan.name}")
    }
}