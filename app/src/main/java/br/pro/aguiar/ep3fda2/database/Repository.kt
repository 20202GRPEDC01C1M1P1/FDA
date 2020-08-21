package br.pro.aguiar.ep3fda2.database

import br.pro.aguiar.ep3fda2.model.Usuario

class Repository {
    fun validarAcessoUsusario(
        email: String,
        senha: String
        ) : Usuario? {
        usuarios.forEach {
            if (it.email.compareTo(email) == 0){
                if (it.senha == senha)
                    return it
                else
                    return null
            }
        }
        return null
    }

    var usuarios = listOf(
        Usuario("Thiago",
            "thi@go.com", "654321"),
        Usuario("Joao",
            "jo@o.com", "987654")
    )
}