package br.pro.aguiar.ep3fda2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_dado.*
import kotlin.random.Random

class DadoFragment : Fragment() {

    var tipo : Int = 4

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_dado,
            container,
            false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnD4.setOnClickListener {
            actionClickLancarDados(it)
        }
        btnD6.setOnClickListener {
            actionClickLancarDados(it)
        }
        btnD10.setOnClickListener {
            actionClickLancarDados(it)
        }
        btnD20.setOnClickListener {
            actionClickLancarDados(it)
        }
    }

    fun actionClickLancarDados(minhaView: View){
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