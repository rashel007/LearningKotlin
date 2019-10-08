package freecodecampkotlin

/**
 * 1. If Statement :
 *  - In Kotlin if statement is similar like java
 *
 * 2. When Statement
 *  - In Kotlin when statement is similar to switch
 *  - else is default in when
 *  - we have to use -> (like : in switch)
 *
 * 3. We can alos use statement as expression
 *
 */


// this is a top lavel variable
var gretting: String? = null

fun main() {

    var name: String? = null

    name = "Rahsel"

    // 1

    if (name == null){
        println("name is null")
    }else{
        println(name)
    }

    name = "me"


    // 2

    when (name){
        null -> println("name is null")
        "me" -> println("Rashel")
        else -> println("empty")
    }

    // 3

    gretting = "hello"

    val grettingMessage = if (gretting == null ) "hi" else gretting

    println(grettingMessage)


    val grettingMessage2 = when(gretting){
        null -> "hi"
        else -> gretting
    }

    println(grettingMessage2)

}