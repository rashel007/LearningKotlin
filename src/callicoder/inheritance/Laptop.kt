package callicoder.inheritance

class Laptop(name: String, id: Int, brand: String) : Computer(name, id) {

    constructor(name: String, id: Int, brand: String, type: String) : this(name, id, brand) {

    }

}