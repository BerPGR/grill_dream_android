package br.com.bernardo.grilldream.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import br.com.bernardo.grilldream.R
import br.com.bernardo.grilldream.model.Lanche
import com.squareup.picasso.Picasso
import java.text.NumberFormat
import java.util.Locale

class LanchesAdapter(
    private val listaLanches: List<Lanche>,
    private val context: Context,
    private val clickCard: (Lanche) -> Unit
) : Adapter<LanchesAdapter.LancheViewHolder>() {

    inner class LancheViewHolder(
        val itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        val imgLanche = itemView.findViewById<ImageView>(R.id.img_lanche)
        val txtName = itemView.findViewById<TextView>(R.id.txt_name_lanche)
        val txtPrice = itemView.findViewById<TextView>(R.id.txt_price)
        val cardView = itemView.findViewById<CardView>(R.id.card_layout)

        fun bind(lanche: Lanche) {
            val currencyFormat = NumberFormat
                .getCurrencyInstance(Locale.getDefault())

            val precoFormatado = currencyFormat.format(lanche.price)

            txtName.text = lanche.name
            txtPrice.text = "R$${precoFormatado}"

            Picasso.get()
                .load(lanche.image)
                .into(imgLanche)

            cardView.setOnClickListener {
                clickCard(lanche)
            }
        }
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
        holder.bind(lanche)
    }
}