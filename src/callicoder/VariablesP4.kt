package callicoder

fun main() {


}

// VARIABLES

fun myVariables() {
    var personName: String
    personName = "Person Name"

    val placeName = "Place Name"

    val hundredThousand = 100_000;
    printThat(hundredThousand)

    val myString: String = "Rashel"
    printThat(myString[0])
    printThat(myString[myString.length - 1])
}


// ARRAYS


fun myArrays() {
    val numbersArray = arrayOf(1, 2, 3, 4)
    val animalArray = arrayOf("Cat", "Dog", "Cow")

    // we can also use mixed data type array. but it is not recommended
    val mixedArray = arrayOf(1, "Cat", true)

    print(numbersArray[0])
    print(animalArray[0])
}

// CONVERSION

fun myConversion() {
    val myInt = 100

    val myLong: Long = myInt.toLong()
    printThat(myLong)

    val myString: String = myInt.toString()
    printThat(myString)

    val myNumberString = "150"

    val stringToNumber: Int = myNumberString.toInt()
    printThat(stringToNumber)
}


fun printThat(value: String) {
    println(value)
}

fun printThat(value: Int) {
    println(value)
}

fun printThat(value: Char) {
    println(value)
}

fun printThat(value: Long) {
    println(value)
}