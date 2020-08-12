package br.pro.aguiar.ep3fda2.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.pro.aguiar.ep3fda2.R
import kotlinx.android.synthetic.main.activity_1.*

class Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        var extraIdade = intent.getIntExtra("idade", 0)
        var extraCidade = intent.getStringExtra("cidade")

        txtAct1.text = "${extraIdade}\n${extraCidade}"
    }
}