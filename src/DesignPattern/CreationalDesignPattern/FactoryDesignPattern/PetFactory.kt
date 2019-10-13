package DesignPattern.CreationalDesignPattern.FactoryDesignPattern

fun main() {

    val factory: AnimalFactory = PetStoreFactory()

    val calAnimal: Animal? = factory.getType(AnimalType.CAT)

    calAnimal?.makeSound()
    calAnimal?.moveAround()
}