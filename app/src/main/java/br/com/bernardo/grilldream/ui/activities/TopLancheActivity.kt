package br.com.bernardo.grilldream.ui.activities

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import br.com.bernardo.grilldream.R
import br.com.bernardo.grilldream.databinding.ActivityTopLancheBinding
import br.com.bernardo.grilldream.model.Lanche
import com.squareup.picasso.Picasso

class TopLancheActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityTopLancheBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val bundle = intent.extras

        binding.btnBack.setOnClickListener {
            finish()
        }

        val lanche = if (Build.VERSION.SDK_INT >= 33) {
            bundle?.getParcelable("lanche", Lanche::class.java)
        } else {
            bundle?.getParcelable("lanche")
        }

        if (lanche != null) {
            Picasso.get()
                .load(lanche.image)
                .into(binding.imgLanche)
            binding.txtName.text = lanche.name
            binding.ratingBar.rating = lanche.rating
            binding.txtDescription.text = lanche.desc

            binding.txtBreadType.text = lanche.infos.tipoPao
            binding.txtMeatType.text = lanche.infos.tipoCarne
            binding.txtMeatSize.text = lanche.infos.tamanhoCarne
        }

    }
}