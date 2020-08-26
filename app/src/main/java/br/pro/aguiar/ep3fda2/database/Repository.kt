package br.pro.aguiar.ep3fda2.database

import br.pro.aguiar.ep3fda2.model.Leitura
import br.pro.aguiar.ep3fda2.model.Livro
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
    fun livrosAll() : List<Livro>{
        return livros
    }
    fun leituraShow() : Leitura {
        return Leitura(
            livros.get(3),
            987
        )
    }

    var usuarios = listOf(
        Usuario("Thiago",
            "thi@go.com", "654321"),
        Usuario("Joao",
            "jo@o.com", "987654")
    )
    var livros = listOf(
        Livro("Dominando Kotlin 2",
            "Android com Kotlin",
            "João Pereira Nunes",
            600),
        Livro("Dominando Kotlin",
            "Android com Kotlin",
            "João Pereira",
            511),
        Livro("Dominando Java",
            "Android com Java",
            "Marcia Pereira",
            487)
    )
}