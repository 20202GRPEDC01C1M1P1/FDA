package br.pro.aguiar.ep3fda2.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.pro.aguiar.ep3fda2.R
import kotlinx.android.synthetic.main.activity_form_imc.*

class FormImcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_imc)

        btnCalcularIMC.setOnClickListener {
            var altura = edTxtAltura.text.toString()
            var peso = edTxtPeso.text.toString()

            var transicao = Intent(this, ResultImcActivity::class.java)
            transicao.putExtra("altura", altura)
            transicao.putExtra("peso", peso)

            startActivity(transicao)
        }

//        ResultImcActivity
    }

}