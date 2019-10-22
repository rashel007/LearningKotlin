package callicoder.classes

class MySecondClass (_id: Int, _name: String){

//    val id: Int = _id
//    get() = field


    // below code will generate stackoverflow error
//    var id: Int = _id
//    set(value){
//        id = value
//    }

    // below code will generate stackoverflow error
//    var name: String = _name
//    get () = name
//    set(value){
//        field = value
//    }
}