package callicoder.classes

fun main() {
//    var myClass = MyFirstClass("EA", "Rashel")
//    var myClass2 = MyFirstClass("EA", "Rashel", 20)
//    var myClass3 = MyFirstClass("EA", "Rashel", 20, "0179900...")

    var  mySecondClass: MySecondClass = MySecondClass(12, "Rashel")

    // this will show error, as id is immutable (val)
//    mySecondClass.id = 10


    // below code will generate stackoverflow error
//    println("${mySecondClass.name}")

//    mySecondClass.id = 23


}