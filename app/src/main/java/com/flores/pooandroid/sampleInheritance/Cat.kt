package com.flores.pooandroid.sampleInheritance

class Cat : Animal() {

    fun climb(): String {
        return "Dog climb"
    }

    fun climbAndEat(): String {
        return climb() + eat()
    }

    fun climbAndEatAndColor(): String {
        return climb() + " " + eat() + " " + color
    }

}