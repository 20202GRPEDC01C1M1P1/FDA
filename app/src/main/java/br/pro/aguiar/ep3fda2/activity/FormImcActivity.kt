package br.pro.aguiar.ep3fda2.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.pro.aguiar.ep3fda2.R
import br.pro.aguiar.ep3fda2.model.User
import kotlinx.android.synthetic.main.activity_form_imc.*

class FormImcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_imc)

        btnCalcularIMC.setOnClickListener {

            var nome = edTxtNome.text.toString()
            var idade = edTxtIdade.text.toString()
            var sexo = edTxtSexo.text.toString()
            var perfil = edTxtPerfil.text.toString()
            var altura = edTxtAltura.text.toString()
            var peso = edTxtPeso.text.toString()

            var user = User(
                    nome, idade.toInt(),
                    sexo, perfil,
                    altura.toFloat(), peso.toFloat()
                )

            // Abrir a base
            // executar a query passo o user
            // validar se a query foi executada

            // var validador = user.save() : Boolean

            Toast.makeText(
                this,
                "O seu IMC é ${user.calcularIMC()}",
                Toast.LENGTH_LONG
            ).show()

        }

    }

}