package br.com.bernardo.grilldream.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import br.com.bernardo.grilldream.R
import br.com.bernardo.grilldream.databinding.ActivityMainBinding
import br.com.bernardo.grilldream.ui.fragments.HomeFragment
import br.com.bernardo.grilldream.ui.fragments.MenuFragment
import br.com.bernardo.grilldream.ui.fragments.SettingsFragment

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.bottomNavigationView.setOnNavigationItemSelectedListener { menu ->
            when(menu.itemId) {
                R.id.navigation_home -> {
                    loadFragment(HomeFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.navigation_menu -> {
                    loadFragment(MenuFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.navigation_settings -> {
                    loadFragment(SettingsFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                else -> false
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}