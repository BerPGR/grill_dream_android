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
import br.com.bernardo.grilldream.model.InfoLanche
import br.com.bernardo.grilldream.model.Lanche
import br.com.bernardo.grilldream.ui.activities.CreateHamburguerActivity
import br.com.bernardo.grilldream.ui.activities.TopLancheActivity

class HomeFragment : Fragment() {

    private val listaDeLanches = mutableListOf(
        Lanche("Gourmet Bliss", R.drawable.gourmet_bliss, 19.90, 4,
            InfoLanche("Brioche", "Brisket", "180g")
        ),
        Lanche("Heavenly Bites", R.drawable.heavenly_bites, 24.75, 5,
            InfoLanche("Americano", "Fraldinha", "220g")
        ),
        Lanche("Juicy Beast", R.drawable.juicy_beast, 19.90, 4,
            InfoLanche("Brioche", "Angus", "180g")
        ),
        Lanche("Umami Eruption", R.drawable.umami_eruption, 26.00, 4,
            InfoLanche("Italiano", "Peito de frango", "200g")
        ),
        Lanche("Master Deluxe", R.drawable.master_deluxe, 22.50, 5,
            InfoLanche("Ciabatta", "Angus", "200g")
        ),
        Lanche("Prime Stack", R.drawable.prime_stack, 18.90, 4,
            InfoLanche("Pão de batata", "Prime Rib", "160g")
        ),
        Lanche("Savory Summit", R.drawable.savory_summit, 21.90, 5,
            InfoLanche("Australiano", "Costela", "180g")
        ),
        Lanche("Sizzle Fusion", R.drawable.sizzle_fusion, 22.90, 5,
            InfoLanche("Pão de cebola", "Bacon e Angus", "190g")
        )
    )

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