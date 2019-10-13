package DesignPattern.CreationalDesignPattern.FactoryDesignPattern

interface AnimalFactory {

   fun  getType(type: AnimalType): Animal?

}