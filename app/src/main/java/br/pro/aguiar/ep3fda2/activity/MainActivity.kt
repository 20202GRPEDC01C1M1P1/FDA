package br.pro.aguiar.ep3fda2.activity

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.widget.Toast
import br.pro.aguiar.ep3fda2.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        btnLancarDado.setOnClickListener {
//            var intentListaUsuarios =
//                Intent(
//                    this,
//                    ListaUsuariosActivity::class.java
//                )
//            startActivityForResult(
//                intentListaUsuarios, 100
//            )
//        }
    }


}
