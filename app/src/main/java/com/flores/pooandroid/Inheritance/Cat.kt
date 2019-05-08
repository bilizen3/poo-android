package com.flores.pooandroid.Inheritance

class Cat : Animal() {

    fun climb(){
        print("Dog climb")
    }

    fun climbAndEat(){
        eat()
        climb()
    }

    fun climbAndEatAndColor(){
        eat()
        climb()
        print("Dog $color")
    }
}