package br.pro.aguiar.ep3fda2.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.pro.aguiar.ep3fda2.R
import br.pro.aguiar.ep3fda2.model.User
import kotlinx.android.synthetic.main.activity_result_imc.*

class ResultImcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imc)

        var usuario =
            intent.getSerializableExtra("usuario") as User

        var resultado = usuario.peso / (usuario.altura * usuario.altura)
        txtVwResultado.text = resultado.toString()
    }
}