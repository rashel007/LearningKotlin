package callicoder

fun main() {
    val number = 20

//    when{
//        number < 0 -> println("Number is Less then 0")
//        number % 2 == 0 -> println("Number is Even")
//        number < 50 -> println("Number is less then 50")
//    }

    val myArray = intArrayOf(2,3,4,5,6,7)

    for (index in myArray.indices){
        println("Index ${index+1} = ${myArray[index]}")
    }
}