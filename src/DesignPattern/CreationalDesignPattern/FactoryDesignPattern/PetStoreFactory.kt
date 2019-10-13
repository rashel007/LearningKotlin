package DesignPattern.CreationalDesignPattern.FactoryDesignPattern

class PetStoreFactory: AnimalFactory {
    override fun getType(type: AnimalType): Animal? {

//        if (type == AnimalType.CAT){
//            return Cat()
//        }else if (type == AnimalType.DOG){
//            return Dog()
//        }else{
//            return null
//        }

        return when(type){
            AnimalType.DOG ->  Dog()
            AnimalType.CAT ->  Cat()
        }

    }
}