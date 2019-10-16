package smartherd

fun main() {
    val number = 20

    when{
        number < 0 -> println("Number is Less then 0")
        number % 2 == 0 -> println("Number is Even")
        number < 50 -> println("Number is less then 50")
    }
}