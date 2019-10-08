package freecodecampkotlin


/**
 * Here we will see some example about how we can create function in kotlin
 */

// void function

fun grettings2(){
    println(grettings())
}

// function which can return null

fun grettings(): String? {
    return null
}

// fun that will return

fun getcount():Int {
    return 2;
}

// single expression function

fun getName()  = "Rashel"


fun main() {

    println(grettings())

    grettings2()

    println(getcount())

    println(getName())
}