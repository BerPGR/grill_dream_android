package br.com.bernardo.grilldream.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.bernardo.grilldream.Adapter.LanchesAdapter
import br.com.bernardo.grilldream.R
import br.com.bernardo.grilldream.databinding.FragmentHomeBinding
import br.com.bernardo.grilldream.model.Lanche

class HomeFragment : Fragment() {

    private val listaDeLanches = mutableListOf(
        Lanche("Gourmet Bliss", R.drawable.gourmet_bliss),
        Lanche("Heavenly Bites", R.drawable.heavenly_bites),
        Lanche("Juicy Beast", R.drawable.juicy_beast),
        Lanche("Umami Eruption", R.drawable.umami_eruption),
        Lanche("Master Deluxe", R.drawable.master_deluxe),
        Lanche("Prime Stack", R.drawable.prime_stack),
        Lanche("Savory Summit", R.drawable.heavenly_bites),
        Lanche("Sizzle Fusion", R.drawable.sizzle_fusion)
    )
/*
    private val binding by lazy {
        FragmentHomeBinding.inflate(layoutInflater)
    }*/

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
        rvtoplanches.adapter = LanchesAdapter(listaDeLanches, requireContext())
        rvtoplanches.layoutManager = GridLayoutManager(requireContext(), 2)

        return view
    }
}