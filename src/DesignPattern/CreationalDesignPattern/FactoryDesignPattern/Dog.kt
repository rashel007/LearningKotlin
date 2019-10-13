package DesignPattern.CreationalDesignPattern.FactoryDesignPattern

class Dog: Animal("Dog") {
    override fun makeSound() {
        println("$name Louder Sound. Vow Vow ......")
    }

    override fun moveAround() {
        println("$name Can Move First")
    }
}