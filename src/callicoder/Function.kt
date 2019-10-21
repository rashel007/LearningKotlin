package callicoder

import freecodecampkotlin.defaultFunc


fun main() {
//    funwithDefaultArg(val2 = 50)
//
//    // variable number of arguments (vararg)
//    println(varargsExample(2, 3, 4))
//
//    // suppose we have a
//
//    var myArrayL: IntArray = intArrayOf(2, 3, 4, 5, 6)
//
//    // this will throw error
////  varargsExample(myArrayL)
//    //  we have to pass it like this
//    println(varargsExample(*myArrayL))


    println(myNestedFuntionExample(4, 7))
}

fun funwithDefaultArg(val1: Int = 40, val2: Int) {

    println("${val1 + val2}")


}

fun varargsExample(vararg numbers: Int): Int {
    var sum = 0

    for (number in numbers) {
        sum = sum + number
    }

    return sum

}

fun myNestedFuntionExample(num1: Int, num2: Int): Int {


    fun calculate(): Int {
        val avg: Int = (num1 + num2) / 2
        return avg
    }

    return calculate()
}


