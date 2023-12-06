package br.com.bernardo.grilldream.ui.activities

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import br.com.bernardo.grilldream.R
import br.com.bernardo.grilldream.databinding.ActivityTopLancheBinding
import br.com.bernardo.grilldream.model.Lanche

class TopLancheActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityTopLancheBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val bundle = intent.extras
        val lanche = if (Build.VERSION.SDK_INT >= 33) {
            bundle?.getParcelable("lanche", Lanche::class.java)
        } else {
            bundle?.getParcelable("lanche")
        }

        /Log.i("top_lanche_activity", "${lanche?.name} - ${lanche?.rating}")
    }
}