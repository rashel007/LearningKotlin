package freecodecampkotlin

open class UseOfInterface : PersonInfoProvider{

    override fun printInfo(info: FirstClass) {
        println(info.printInfo())
    }
}


fun main() {
    val myInfo = UseOfInterface()
    myInfo.printInfo(FirstClass())




}