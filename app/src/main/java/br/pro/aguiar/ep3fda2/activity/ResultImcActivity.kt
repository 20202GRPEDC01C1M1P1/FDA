package br.pro.aguiar.ep3fda2.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.pro.aguiar.ep3fda2.R
import kotlinx.android.synthetic.main.activity_result_imc.*

class ResultImcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imc)

        var altura = intent.getStringExtra("altura")!!.toInt()
        var peso = intent.getStringExtra("peso")!!.toInt()

        var resultado = peso / (altura * altura)
        txtVwResultado.text = resultado.toString()
    }
}