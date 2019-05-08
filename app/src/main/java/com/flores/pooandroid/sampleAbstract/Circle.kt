package com.flores.pooandroid.sampleAbstract

class Circle(private val radio: Double) : Shape() {

    private val type = "Circle"

    override fun getAreaObject(): Double {
        return radio * radio * Math.PI
    }

    override fun getPerimeterObject(): Double {
        return 2 * Math.PI * radio
    }

    override fun getTypeObject(): String {
        return type
    }
}