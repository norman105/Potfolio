package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
lateinit var textView: TextView
lateinit var text_View:  TextView
lateinit var text: TextView
lateinit var texting: TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text_View =findViewById(R.id.textView1)
        text_View.setOnClickListener {
            Toast.makeText(applicationContext,"Already in home page" ,Toast.LENGTH_LONG).show()
        }
        texting =findViewById(R.id.textView4)
        texting.setOnClickListener {
            val intentPage =Intent( this@MainActivity,PageActitivy::class.java)
            startActivity(intentPage)

        }
        text = findViewById(R.id.textView3)
        text.setOnClickListener {
            val intentContact = Intent( this@MainActivity,ContactActivity::class.java)
            startActivity(intentContact)
        }
        textView =findViewById(R.id.textView2)
        textView.setOnClickListener {
            val intentAbout = Intent(this@MainActivity,AboutActivity::class.java)
            startActivity(intentAbout)
        }
    }

}