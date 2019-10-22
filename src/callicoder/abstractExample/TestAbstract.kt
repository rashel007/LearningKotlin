package callicoder.abstractExample

fun main() {

    val car = Car("Allion", "Pearl", "1000 KG", 100.0)

    car.start()
    println("Car Max Speed is : ${car.maxSpeed}")
    car.stop()

}