package smartherd

fun main() {
    val nullaleName: String? = null
    val name: String = nullaleName ?: "Rashel"

    println("$name")

    // let is a lamda operation
    name?.let {
        println("$name")
    }

    // this will not print anything
    nullaleName?.let {
        println("$nullaleName")
    }

    // this will print null
    println("$nullaleName")
}