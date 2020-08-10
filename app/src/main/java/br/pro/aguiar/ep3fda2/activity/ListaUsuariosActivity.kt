package br.pro.aguiar.ep3fda2.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import br.pro.aguiar.ep3fda2.R


class ListaUsuariosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_usuarios)
        Log.i("Ciclo de Vida", "ListaUsuariosActivity.onCreate")
    }

}