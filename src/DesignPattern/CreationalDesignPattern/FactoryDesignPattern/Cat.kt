package DesignPattern.CreationalDesignPattern.FactoryDesignPattern

class Cat: Animal("Cat") {


    override fun makeSound() {
        println("$name Light sound. Mewwww.....")
    }

    override fun moveAround() {
        println("$name Moves Slowly")
    }
}