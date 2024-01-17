package br.com.bernardo.grilldream.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.widget.doAfterTextChanged
import androidx.viewpager2.widget.ViewPager2
import br.com.bernardo.grilldream.Adapter.CarousselAdapter
import br.com.bernardo.grilldream.R
import br.com.bernardo.grilldream.databinding.ActivityCreateHamburguerBinding
import br.com.bernardo.grilldream.helper.listImages
import br.com.bernardo.grilldream.model.CustomHamburger
import java.lang.Integer.parseInt
import kotlin.properties.Delegates

class CreateHamburguerActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityCreateHamburguerBinding.inflate(layoutInflater)
    }

    private lateinit var tipoCarne: String
    private lateinit var tamanhoCarne: String
    private var alface: Boolean = false
    private var tomate: Boolean = false
    private var picles: Boolean = false
    private var queijo: Boolean = false
    private var cebola: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        window.statusBarColor = resources.getColor(R.color.blue)

        binding.btnBack.setOnClickListener {
            finish()
        }

        binding.rbAcem.setOnClickListener {
            binding.rbWagyu.isChecked = false
            binding.rbAlcatra.isChecked = false
            binding.rbPatinho.isChecked = false
            binding.rbPaleta.isChecked = false
            tipoCarne = "Acem"
        }

        binding.rbWagyu.setOnClickListener {
            binding.rbAcem.isChecked = false
            binding.rbAlcatra.isChecked = false
            binding.rbPatinho.isChecked = false
            binding.rbPaleta.isChecked = false
            tipoCarne = "Wagyu"
        }

        binding.rbPatinho.setOnClickListener {
            binding.rbWagyu.isChecked = false
            binding.rbAlcatra.isChecked = false
            binding.rbAcem.isChecked = false
            binding.rbPaleta.isChecked = false
            tipoCarne = "Patinho"
        }

        binding.rbPaleta.setOnClickListener {
            binding.rbWagyu.isChecked = false
            binding.rbAlcatra.isChecked = false
            binding.rbPatinho.isChecked = false
            binding.rbAcem.isChecked = false
            tipoCarne = "Paleta"
        }

        binding.rbAlcatra.setOnClickListener {
            binding.rbWagyu.isChecked = false
            binding.rbAcem.isChecked = false
            binding.rbPatinho.isChecked = false
            binding.rbPaleta.isChecked = false
            tipoCarne = "Alcatra"
        }

        binding.btnAddToCart.setOnClickListener {
            tamanhoCarne = binding.editMeatWeight.text.toString()
            var tamanho = 0

            try {
                tamanho = tamanhoCarne.toInt()
            } catch (e: NumberFormatException) {
                Toast.makeText(this, "Adicione um mnumero valido", Toast.LENGTH_SHORT).show()
            }

            val customHamburguer = CustomHamburger(
                "Brioche",
                tipoCarne,
                tamanho,
                binding.rbQueijo.isChecked,
                binding.rbAlface.isChecked,
                binding.rbTomate.isChecked,
                binding.rbPicles.isChecked,
                binding.rbCebola.isChecked,
                )

            var resultado = "${customHamburguer.pao}, ${customHamburguer.carne}, ${customHamburguer.tamanhoCarne}g," +
                    "\n"

            if (customHamburguer.queijo) {
                resultado += "\nQueijo"
            }

            if (customHamburguer.tomate) {
                resultado += "\nTomate"
            }

            if (customHamburguer.cebola) {
                resultado += "\nCebola"
            }

            if (customHamburguer.alface) {
                resultado += "\nAlface"
            }

            if (customHamburguer.picles) {
                resultado += "\nPicles"
            }

            Log.i("custom_ham", resultado)
        }
    }
}