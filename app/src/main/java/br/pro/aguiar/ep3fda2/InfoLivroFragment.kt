package br.pro.aguiar.ep3fda2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.pro.aguiar.ep3fda2.database.Repository
import kotlinx.android.synthetic.main.fragment_info_livro.*

class InfoLivroFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info_livro, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var leitura = Repository().leituraShow()

        txtInfoLivroTitulo.text = leitura.livro.titulo
        txtInfoLivroSubTitulo.text = leitura.livro.subtitulo
        txtInfoLivroAutor.text = leitura.livro.autor
        txtInfoLivroPaginaAtual.text = leitura.paginaAtual.toString()
    }
}