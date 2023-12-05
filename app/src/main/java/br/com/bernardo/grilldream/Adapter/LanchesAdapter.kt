package br.com.bernardo.grilldream.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import br.com.bernardo.grilldream.R
import br.com.bernardo.grilldream.model.Lanche
import com.squareup.picasso.Picasso

class LanchesAdapter(
    private val listaLanches: List<Lanche>,
    private val context: Context
): Adapter<LanchesAdapter.LancheViewHolder>() {

    inner class LancheViewHolder(
        val itemView: View
    ): RecyclerView.ViewHolder(itemView) {

        val imgLanche = itemView.findViewById<ImageView>(R.id.img_lanche)
        val txtName = itemView.findViewById<TextView>(R.id.txt_nome_lanche)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LancheViewHolder {
        val view = LayoutInflater.from(
            context
        ).inflate(
            R.layout.top_lanche_card,
            parent,
            false
        )

        return LancheViewHolder(view)
    }

    override fun getItemCount(): Int = listaLanches.size

    override fun onBindViewHolder(holder: LancheViewHolder, position: Int) {
        val lanche = listaLanches[position]

        holder.txtName.text = lanche.name

        Picasso.get()
            .load(lanche.image)
            .into(holder.imgLanche)
    }
}