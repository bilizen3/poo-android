package com.flores.pooandroid.sampleAbstract

abstract class Shape {

    var colorShape: String = "Blue"

    abstract fun getAreaObject(): Double

    abstract fun getPerimeterObject(): Double

    abstract fun getTypeObject(): String

    fun getColorObject(): String {
        return colorShape
    }

}