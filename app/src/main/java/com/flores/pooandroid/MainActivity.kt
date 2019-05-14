package com.flores.pooandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.flores.pooandroid.sampleAbstract.AbstractActivity
import com.flores.pooandroid.sampleEncapsulation.EncapsulationActivity
import com.flores.pooandroid.sampleInheritance.InheritanceActivity
import com.flores.pooandroid.samplePolymorphism.PolymorphismActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHeritage.setOnClickListener {
            startActivity(Intent(this, InheritanceActivity::class.java))
        }

        btnEncapsulation.setOnClickListener {
            startActivity(Intent(this, EncapsulationActivity::class.java))
        }

        btnAbstract.setOnClickListener {
            startActivity(Intent(this, AbstractActivity::class.java))
        }

        btnPolymorphism.setOnClickListener {
            startActivity(Intent(this, PolymorphismActivity::class.java))
        }

    }
}
