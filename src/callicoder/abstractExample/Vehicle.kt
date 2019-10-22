package callicoder.abstractExample

// concrete non-abstract property
abstract class Vehicle(val name: String, val color: String, val weight: String) {

    // abstract property (Must be overridden by sub class)
    abstract var maxSpeed: Double

    // abstract Methods (Must be overridden by sub class)
    abstract fun start()
    abstract fun stop()

    // Concrete non-abstract Method
    fun displayDetails() {

        println("Name: $name, Color: $color, Weight: $weight")
    }


}