package com.example.portfolio

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.portfolio.R.id
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_about2.*

class AboutActivity : AppCompatActivity(),BottomNavigationView.OnNavigationItemSelectedListener {
    private lateinit var bottom: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about2)
        bottom = findViewById(R.id.BottomNav)
        bottom.setOnNavigationItemSelectedListener(this)
    }


    override fun onNavigationItemSelected (item: MenuItem): Boolean{

        when (item.itemId) {
            R.id.nav_main -> {
                val intentHome = Intent(this@AboutActivity, MainActivity::class.java)
                startActivity(intentHome)
            }
            R.id.nav_about -> {
                val intentMain = Intent(this@AboutActivity, AboutActivity::class.java)
                startActivity(intentMain)
            }
            R.id.nav_contact -> {
                val intentMain = Intent(this@AboutActivity, ContactActivity::class.java)
                startActivity(intentMain)
            }
            R.id.nav_page -> {
                val intentMain = Intent(this@AboutActivity, PageActitivy::class.java)
                startActivity(intentMain)
            }

        }
        return true
}


}
