package freecodecampkotlin

/**
 * In Kotlin collection like listof, mapof are by default immutable
 * if we want to use mutable collection we have to use mutableListof or mutablemap of
 */

fun main() {

    val interestingThings = arrayListOf("Kotlin", "MVVM", "LiveData,ViewModel", "Unit Testing")

    // to print the size of an arraylist
    println(interestingThings.size)

    // to print specific index of arraylist
    println(interestingThings[0])
    //or
    println(interestingThings.get(0))



    // to printout all the element in arraylist
    for (interestingThing in interestingThings){
        println(interestingThing)
    }

//     or we can do it like this
//     here it is the default name

    interestingThings.forEach {
        println(it)
    }

    // if we want to change the default name. we can do it like this
    interestingThings.forEach { interestingThing ->
        println(interestingThing)

    }

    // if we want to print all arrylist with index number we can do ti like this

    interestingThings.forEachIndexed { index, interestingThing ->

        println("$interestingThing is at index $index")
    }


    // we can also use listOf . it is same as arraylist with additional functionality

    var interestingThingList = listOf("a", "b", "c")

    // using map

    val listOfMap = mapOf(1 to "A", 2 to "B", 3 to "C")

    listOfMap.forEach { key, value -> println("$key -> $value") }

    // here we cannnot add more value in listof or mapof collection
    // to do that we have to use this

    var mutableListOF = mutableListOf("A", "B", "C")
    mutableListOF.add("D")

    val mutableMapOF = mutableMapOf(1 to "A", 2 to "B")
    mutableMapOF.put(1, "C")


}