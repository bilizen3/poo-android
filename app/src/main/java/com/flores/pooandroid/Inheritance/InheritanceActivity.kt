package com.flores.pooandroid.Inheritance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.flores.pooandroid.R

class InheritanceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heritage)
        val cat = Cat()
        cat.climb()
        cat.climbAndEat()
        cat.climbAndEatAndColor()

        val dog = Dog()
        dog.run()
        dog.runAndEat()
    }
}
