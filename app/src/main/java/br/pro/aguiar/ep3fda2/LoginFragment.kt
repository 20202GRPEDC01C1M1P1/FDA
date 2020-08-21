package br.pro.aguiar.ep3fda2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import br.pro.aguiar.ep3fda2.activity.DashboardActivity
import br.pro.aguiar.ep3fda2.database.Repository
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnAcessar.setOnClickListener {
            var email = editTextTextEmailAddress.text.toString()
            var senha = editTextTextPassword.text.toString()

            if (Repository().validarAcessoUsusario(email, senha) != null){
                var intent = Intent(
                    activity,
                    DashboardActivity::class.java
                )
                startActivity(intent)
            } else {
                Toast.makeText(
                    activity,
                    "Usuário e senha não conferem!",
                    Toast.LENGTH_LONG
                ).show()
            }


        }
    }
}