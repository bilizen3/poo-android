package com.flores.pooandroid.heritage

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