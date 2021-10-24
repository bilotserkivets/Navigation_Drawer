package com.example.testnavigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.example.testnavigationdrawer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            // Висування контейнеру по натисканню кнопки
            btnOpenMenu.setOnClickListener {
                drawer.openDrawer(GravityCompat.START)
            }
            // Дії при натисканні елементів меню
            nv.setNavigationItemSelectedListener {
                when(it.itemId) {
                    R.id.settings -> {
                        Toast.makeText(this@MainActivity, "Settings",
                            Toast.LENGTH_LONG)
                            .show()
                    }
                    R.id.save -> {
                        Toast.makeText(this@MainActivity, "Save",
                            Toast.LENGTH_LONG)
                            .show()
                    }
                    R.id.phone -> {
                        Toast.makeText(this@MainActivity, "Phone",
                            Toast.LENGTH_LONG)
                            .show()
                    }
                    R.id.cafe -> {
                        Toast.makeText(this@MainActivity, "Cafe",
                            Toast.LENGTH_LONG)
                            .show()
                    }
                }
                // Приховування контейнеру після вибору елемента меню
                drawer.closeDrawer(GravityCompat.START)
                true
            }
        }
    }
}