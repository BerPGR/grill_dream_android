package br.com.bernardo.grilldream.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import br.com.bernardo.grilldream.R
import br.com.bernardo.grilldream.model.CarousselImage
import com.squareup.picasso.Picasso

class CarousselAdapter(
    private val listImages: List<CarousselImage>
) : Adapter<CarousselAdapter.CarousselViewHolder>() {

    inner class CarousselViewHolder(
        val itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        val image = itemView.findViewById<ImageView>(R.id.imageView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarousselViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.image_caroussel, parent, false)

        return CarousselViewHolder(view)
    }

    override fun getItemCount(): Int = listImages.size

    override fun onBindViewHolder(holder: CarousselViewHolder, position: Int) {
        val image = listImages[position]

        Picasso.get()
            .load(image.imgUrl)
            .into(holder.image)
    }

}