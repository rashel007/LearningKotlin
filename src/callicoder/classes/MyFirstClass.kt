package callicoder.classes

import java.lang.IllegalArgumentException

class MyFirstClass(var firstName: String, var lastName: String) {

    var age: Int? = null

    var phoneNumber: String? = null


    constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
        this.age = if (age > 0) age else throw IllegalArgumentException("Age must be greater then 0")
    }

    constructor(firstName: String, lastName: String, age: Int, phoneNumber: String) : this(firstName, lastName, age) {
        this.phoneNumber =
            if (phoneNumber != null) phoneNumber else throw IllegalArgumentException("Provide Phone NUmber")
    }
}