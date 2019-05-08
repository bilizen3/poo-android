package com.flores.pooandroid.sampleAbstract

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.flores.pooandroid.R
import kotlinx.android.synthetic.main.activity_abstract.*

class AbstractActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abstract)

        val rectangle = Rectangle(10.2, 4.5)
        showText(rectangle.getColorObject())
        showText(rectangle.getTypeObject())
        showText(rectangle.getAreaObject().toString())
        showText(rectangle.getPerimeterObject().toString())

        val circle = Circle(23.4)
        showText(circle.getColorObject())
        showText(circle.getTypeObject())
        showText(circle.getAreaObject().toString())
        showText(circle.getPerimeterObject().toString())
    }

    private fun showText(text: String) {
        tvShow.text = tvShow.text.toString() + "\n" + text
    }
}
