package freecodecampkotlin

/**
 * in kotlin class variable has default getters and setters
 */

class FirstClass(val firstName: String = "Ea", val lastName: String = "Rashel") {

    var nickName: String? = null
    set(value) {
        field  = value
        println("New Nickname is $value")
    }
    get() {
        println("This is getter $field")
        return  field
    }

//    init {
//        println("This is my FirslClass first init")
//    }

//    // this is a secondary constructor
//    constructor() : this("EA", "Rashel"){
//        println("$firstName $lastName")
//    }

//    init {
//        println("This is my FirstClass second init")
//    }


    fun printInfo(){
//        val nickNameToCheck = if (nickName != null) nickName else "(No Nickname)"
        // using elvic operator
        val nickNameToCheck = nickName ?: "(No NickName)"
        println("$firstName $lastName $nickNameToCheck" )
    }
}