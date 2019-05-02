package com.flores.pooandroid.heritage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.flores.pooandroid.R

class HeritageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heritage)
        val cat=Cat()
        cat.climb()
        cat.climbAndEat()
        cat.climbAndEatAndColor()
    }
}
