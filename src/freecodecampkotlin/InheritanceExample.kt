package freecodecampkotlin


/**
 * for inheritence we have to mane the class open
 */

class MyInfo: UseOfInterface(){

    override fun printInfo(info: FirstClass) {
        super.printInfo(info)
        println("Calling for  MyInfo")
    }
}