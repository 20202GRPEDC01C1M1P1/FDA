package br.pro.aguiar.ep3fda2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import br.pro.aguiar.ep3fda2.activity.LivroInfoActivity
import br.pro.aguiar.ep3fda2.database.Repository
import kotlinx.android.synthetic.main.fragment_list_livro.*

class ListLivroFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(
            R.layout.fragment_list_livro,
            container,
            false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lstVwLivros.adapter = ArrayAdapter(
            activity!!.applicationContext,
            android.R.layout.simple_list_item_1,
            Repository().livrosAll()
        )

        lstVwLivros.setOnItemClickListener {
                adapterView, view, i, l ->
            //var livro = Repository().livrosAll().get(i)
            var intent = Intent(
                activity,
                LivroInfoActivity::class.java
            )
            intent.putExtra("livro_id", i)
            startActivity(intent)
        }

    }

}