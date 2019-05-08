package com.flores.pooandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.flores.pooandroid.Inheritance.InheritanceActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnHeritage.setOnClickListener {
            startActivity(Intent(this, InheritanceActivity::class.java))
        }
    }
}
