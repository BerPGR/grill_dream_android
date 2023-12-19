package br.com.bernardo.grilldream.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
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

        val viewPager = binding.viewPager
        viewPager.adapter = CarousselAdapter(listImages)

        binding.btnAcem.setOnClickListener {
            it.setBackgroundResource(R.drawable.rounded_button_enable)
            binding.btnAlcatra.setBackgroundResource(R.drawable.rounded_button_disable)
            binding.btnPatinho.setBackgroundResource(R.drawable.rounded_button_disable)
            binding.btnWagyu.setBackgroundResource(R.drawable.rounded_button_disable)
            binding.btnPaleta.setBackgroundResource(R.drawable.rounded_button_disable)
        }

        binding.btnAlcatra.setOnClickListener {
            it.setBackgroundResource(R.drawable.rounded_button_enable)
            binding.btnAcem.setBackgroundResource(R.drawable.rounded_button_disable)
            binding.btnPatinho.setBackgroundResource(R.drawable.rounded_button_disable)
            binding.btnWagyu.setBackgroundResource(R.drawable.rounded_button_disable)
            binding.btnPaleta.setBackgroundResource(R.drawable.rounded_button_disable)
        }

        binding.btnPatinho.setOnClickListener {
            it.setBackgroundResource(R.drawable.rounded_button_enable)
            binding.btnAlcatra.setBackgroundResource(R.drawable.rounded_button_disable)
            binding.btnAcem.setBackgroundResource(R.drawable.rounded_button_disable)
            binding.btnWagyu.setBackgroundResource(R.drawable.rounded_button_disable)
            binding.btnPaleta.setBackgroundResource(R.drawable.rounded_button_disable)
        }

        binding.btnWagyu.setOnClickListener {
            it.setBackgroundResource(R.drawable.rounded_button_enable)
            binding.btnAlcatra.setBackgroundResource(R.drawable.rounded_button_disable)
            binding.btnPatinho.setBackgroundResource(R.drawable.rounded_button_disable)
            binding.btnAcem.setBackgroundResource(R.drawable.rounded_button_disable)
            binding.btnPaleta.setBackgroundResource(R.drawable.rounded_button_disable)
        }

        binding.btnPaleta.setOnClickListener {
            it.setBackgroundResource(R.drawable.rounded_button_enable)
            binding.btnAlcatra.setBackgroundResource(R.drawable.rounded_button_disable)
            binding.btnPatinho.setBackgroundResource(R.drawable.rounded_button_disable)
            binding.btnWagyu.setBackgroundResource(R.drawable.rounded_button_disable)
            binding.btnAcem.setBackgroundResource(R.drawable.rounded_button_disable)
        }

        binding.btnAlface.setOnClickListener {
            if (it.background.constantState == ContextCompat.getDrawable(this, R.drawable.rounded_button_enable)?.constantState) {
                it.setBackgroundResource(R.drawable.rounded_button_disable)
            }
            else {
                it.setBackgroundResource(R.drawable.rounded_button_enable)
            }
        }

        binding.btnTomate.setOnClickListener {
            if (it.background.constantState == ContextCompat.getDrawable(this, R.drawable.rounded_button_enable)?.constantState) {
                it.setBackgroundResource(R.drawable.rounded_button_disable)
            }
            else {
                it.setBackgroundResource(R.drawable.rounded_button_enable)
            }
        }

        binding.btnQueijo.setOnClickListener {
            if (it.background.constantState == ContextCompat.getDrawable(this, R.drawable.rounded_button_enable)?.constantState) {
                it.setBackgroundResource(R.drawable.rounded_button_disable)
            }
            else {
                it.setBackgroundResource(R.drawable.rounded_button_enable)
            }
        }

        binding.btnCebola.setOnClickListener {
            if (it.background.constantState == ContextCompat.getDrawable(this, R.drawable.rounded_button_enable)?.constantState) {
                it.setBackgroundResource(R.drawable.rounded_button_disable)
            }
            else {
                it.setBackgroundResource(R.drawable.rounded_button_enable)
            }
        }

        binding.btnPicles.setOnClickListener {
            if (it.background.constantState == ContextCompat.getDrawable(this, R.drawable.rounded_button_enable)?.constantState) {
                it.setBackgroundResource(R.drawable.rounded_button_disable)
            }
            else {
                it.setBackgroundResource(R.drawable.rounded_button_enable)
            }
        }
    }
}