package io.github.aungkothet.padc.assignment4

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import io.github.aungkothet.padc.assignment4.fragments.HomeFragment
import io.github.aungkothet.padc.assignment4.fragments.SearchFragment

class MainActivity : AppCompatActivity() {

    private val onNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frame_layout, HomeFragment()).commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_search -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frame_layout, SearchFragment()).commit()
                    return@OnNavigationItemSelectedListener true

                }
                R.id.navigation_bookmark -> return@OnNavigationItemSelectedListener true
                R.id.navigation_calendar -> return@OnNavigationItemSelectedListener true
            }
            false
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        supportFragmentManager.beginTransaction().replace(R.id.main_frame_layout, HomeFragment())
            .commit()
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
}
