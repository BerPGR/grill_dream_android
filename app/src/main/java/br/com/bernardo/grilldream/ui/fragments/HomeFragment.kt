package br.com.bernardo.grilldream.ui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.bernardo.grilldream.Adapter.LanchesAdapter
import br.com.bernardo.grilldream.R
import br.com.bernardo.grilldream.databinding.FragmentHomeBinding
import br.com.bernardo.grilldream.helper.listaDeLanches
import br.com.bernardo.grilldream.model.InfoLanche
import br.com.bernardo.grilldream.model.Lanche
import br.com.bernardo.grilldream.ui.activities.CreateHamburguerActivity
import br.com.bernardo.grilldream.ui.activities.TopLancheActivity

class HomeFragment : Fragment() {

    private val binding by lazy {
        FragmentHomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val rvtoplanches = view.findViewById<RecyclerView>(R.id.rv_tops)
        rvtoplanches.adapter = LanchesAdapter(listaDeLanches, requireContext()){ lanche ->
            val intent = Intent(requireContext(), TopLancheActivity::class.java)

            intent.putExtra("lanche", lanche)

            startActivity(intent)
        }
        rvtoplanches.layoutManager = GridLayoutManager(requireContext(), 2)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnCreate = view.findViewById<Button>(R.id.btn_create)

        btnCreate.setOnClickListener {
            val intent = Intent(activity, CreateHamburguerActivity::class.java)

            startActivity(intent)
        }
        /*binding.btnCreate.setOnClickListener {
            val intent = Intent(activity, CreateHamburguerActivity::class.java)

            startActivity(intent)
        }*/
    }
}