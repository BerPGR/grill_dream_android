package br.com.bernardo.grilldream.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.bernardo.grilldream.R
import br.com.bernardo.grilldream.databinding.ActivityCreateHamburguerBinding

class CreateHamburguerActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityCreateHamburguerBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}