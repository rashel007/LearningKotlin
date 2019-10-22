package callicoder.abstractExample

class Car(name: String, color: String, weight: String, override var maxSpeed: Double) : Vehicle(name, color, weight) {


    override fun start() {
        println("Car Started")
    }

    override fun stop() {
        println("Car Stopped")
    }
}