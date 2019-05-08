package com.flores.pooandroid.Inheritance

class Dog : Animal() {

    fun run() {
        print("Dog run")
    }

    fun runAndEat() {
        eat()
        print("Dog run")
    }

}