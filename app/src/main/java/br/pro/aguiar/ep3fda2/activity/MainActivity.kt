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

    var tipo : Int = 4

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLancarDado.setOnClickListener {
            var intentListaUsuarios =
                Intent(
                    this,
                    ListaUsuariosActivity::class.java
                )
            startActivityForResult(
                intentListaUsuarios, 100
            )
        }
    }

    override fun onActivityResult(
        requestCode: Int, resultCode: Int, data: Intent?)
    {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 100){
            if (resultCode == Activity.RESULT_CANCELED){
                var info = data?.getStringExtra("info")
                Toast.makeText(
                    this, info, Toast.LENGTH_LONG
                ).show()
            } else if (resultCode == Activity.RESULT_OK){
                // Resposta negativa
            }
        }
    }

    fun actionClickTipoDados(minhaView: View){
        when (minhaView.id){
            R.id.btnD4 -> tipo = 4
            R.id.btnD6 -> tipo = 6
            R.id.btnD10 -> tipo = 10
            R.id.btnD20 -> tipo = 20
        }
        val randomInt = Random.nextInt(1, tipo+1)
        txtVwResultado.text = randomInt.toString()
    }
}
