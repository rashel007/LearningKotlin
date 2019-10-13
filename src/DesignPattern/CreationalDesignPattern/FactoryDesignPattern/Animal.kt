package DesignPattern.CreationalDesignPattern.FactoryDesignPattern

abstract class Animal(_name: String) {

    protected val name: String = _name

    abstract fun makeSound()

    abstract fun moveAround()

}