package br.pro.aguiar.ep3fda2.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import br.pro.aguiar.ep3fda2.R
import kotlinx.android.synthetic.main.activity_lista_usuarios.*


class ListaUsuariosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_usuarios)

        btnAct1.setOnClickListener {
            var tansicao = Intent(
                    this, Activity1::class.java
                )
            tansicao.putExtra("idade", 10)
            tansicao.putExtra("cidade", "Rio de Janeiro")

            startActivity(tansicao)
        }

        // btnAct2 -> Activity2::class.java
        btnAct2.setOnClickListener {
            var intent = Intent(
                this, Activity2::class.java
            )
            startActivity(intent)
        }
    }

//    fun toOtherActivity(){
//
//    }
}