package freecodecampkotlin

import com.sun.tools.javac.jvm.Items


fun sayHello(gretting: String , groups: List<String>){

    groups.forEach {group ->
        println("$gretting $group")

    }

}

/**
 * vararg in kotlin
 * vararg meaning variable number of arguments
 *
 * in the below example groups is a array of string
 * and it will be treated as empty array by default
 * so if we want we can pass only gretting in sayHelloVarArg fun
 */

fun sayHelloVarArg(gretting: String, vararg groups: String){

    groups.forEach {group ->
        println("$gretting $group")

    }
}



fun main() {

    val groupList = arrayOf("Biriani", "Kacchi", "Borhani")
//    sayHello("Hi", groupList)

//    sayHelloVarArg("hi")
    // or
    sayHelloVarArg("Hi", "rahim")
    //or
    sayHelloVarArg("Hi", "rahim", "karim", "jaman")

    sayHelloVarArg("HI Array ", *groupList)

    // also we can use named argument
    sayHelloVarArg(groups = *groupList, gretting = "Hola")



}