package br.pro.aguiar.ep3fda2.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import br.pro.aguiar.ep3fda2.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var tipo : Int = 4

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        btnLancarDado.visibility = View.GONE

        // Classe Usuario
        // var user = Usuario()

        btnLancarDado.setOnClickListener {
            var intentListaUsuarios = Intent(
                    this,
                    ListaUsuariosActivity::class.java
                ) // Intent
            startActivity(intentListaUsuarios)
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
