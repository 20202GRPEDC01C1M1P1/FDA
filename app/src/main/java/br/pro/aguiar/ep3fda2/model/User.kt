package br.pro.aguiar.ep3fda2.model

import kotlinx.android.synthetic.main.activity_form_imc.*
import java.io.Serializable

class User (
  var nome: String,
  var idade: Int,
  var sexo: String,
  var perfil: String,
  var altura: Float,
  var peso: Float
  ) : Serializable {

  fun calcularIMC() : Float {
    return peso / (altura * altura)
  }
}