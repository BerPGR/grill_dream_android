package br.com.bernardo.grilldream.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
    }
}