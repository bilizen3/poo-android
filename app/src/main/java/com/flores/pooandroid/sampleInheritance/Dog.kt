package com.flores.pooandroid.sampleInheritance

class Dog : Animal() {

    fun run(): String {
        return "Dog run"
    }

    fun runAndEat(): String {
        return run() + " " + eat()
    }

}