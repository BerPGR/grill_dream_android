package br.com.bernardo.grilldream.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import br.com.bernardo.grilldream.Adapter.CarousselAdapter
import br.com.bernardo.grilldream.R
import br.com.bernardo.grilldream.databinding.ActivityCreateHamburguerBinding
import br.com.bernardo.grilldream.helper.listImages

class CreateHamburguerActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityCreateHamburguerBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        window.statusBarColor = resources.getColor(R.color.blue)

        binding.btnBack.setOnClickListener {
            finish()
        }

        binding.rbAcem.setOnCheckedChangeListener { _, isChecked ->
                binding.rbWagyu.isChecked = false
                binding.rbAlcatra.isChecked = false
                binding.rbPatinho.isChecked = false
                binding.rbPaleta.isChecked = false
        }

        binding.rbWagyu.setOnCheckedChangeListener { _, isChecked ->
            binding.rbAcem.isChecked = false
            binding.rbAlcatra.isChecked = false
            binding.rbPatinho.isChecked = false
            binding.rbPaleta.isChecked = false
        }

        binding.rbPatinho.setOnCheckedChangeListener { _, isChecked ->
            binding.rbWagyu.isChecked = false
            binding.rbAlcatra.isChecked = false
            binding.rbAcem.isChecked = false
            binding.rbPaleta.isChecked = false
        }

        binding.rbPaleta.setOnCheckedChangeListener { _, isChecked ->
            binding.rbWagyu.isChecked = false
            binding.rbAlcatra.isChecked = false
            binding.rbPatinho.isChecked = false
            binding.rbAcem.isChecked = false
        }

        binding.rbAlcatra.setOnCheckedChangeListener { _, isChecked ->
            binding.rbWagyu.isChecked = false
            binding.rbAcem.isChecked = false
            binding.rbPatinho.isChecked = false
            binding.rbPaleta.isChecked = false
        }
    }
}