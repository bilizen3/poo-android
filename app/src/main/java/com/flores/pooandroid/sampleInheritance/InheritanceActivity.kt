package com.flores.pooandroid.sampleInheritance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.flores.pooandroid.R
import kotlinx.android.synthetic.main.activity_heritage.*

class InheritanceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heritage)

        val cat = Cat()
        showText(cat.climb())
        showText(cat.climbAndEat())
        showText(cat.climbAndEatAndColor())

        val dog = Dog()
        showText(dog.run())
        showText(dog.runAndEat())

    }

    private fun showText(text: String) {
        tvShow.text = tvShow.text.toString() + "\n" + text
    }
}
