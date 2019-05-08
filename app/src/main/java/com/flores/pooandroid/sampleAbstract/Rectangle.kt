package com.flores.pooandroid.sampleAbstract

class Rectangle(
    private val width: Double,
    private val height: Double
) : Shape() {

    private val name ="Rectangle"

    override fun getAreaObject(): Double {
        return width * height
    }

    override fun getPerimeterObject(): Double {
        return width * 2 + height * 2
    }

    override fun getTypeObject(): String {
        return name
    }

}