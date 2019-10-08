package freecodecampkotlin


/**
 * Here we will see some example about passing parameter in function
 */


fun whatToSay(grettingTo: String) {
    println("Hello " + grettingTo)
}

// also we can do this
fun whatToSay2(grettingTo: String) {
    println("Hello $grettingTo")
}

// also we can simplyfy it mush more by single expression function

fun whatToSay3(grettingTo: String) = println("Hello $grettingTo")

// this is how we can pass multiple parameter

fun whatToSay4(gretting: String, to: String) = println("$gretting $to")

// also we an set defualt parameter value in function

fun defaultFunc(great: String = "hello", to: String = "Kotlin") {
        println("$great $to")
}

fun main() {

//    whatToSay("Kotlin")
//
//    whatToSay2("World")
//
//    whatToSay3("Rashel")
//
//    whatToSay4("Hello", "Kotlin")
//
//    whatToSay4("Welcome", "Rashel")

    defaultFunc()
    defaultFunc("Hi")
    defaultFunc("Hi", "Rashel")
}