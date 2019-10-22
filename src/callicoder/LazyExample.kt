package callicoder

/**
 * lazy is used so that is an object create only one instance in a class
 */
class LazyClass {
    private val latientClass: LateinitClass by lazy {
        println("Object Initialized")
        LateinitClass()
    }

    fun acceddLatientClass() {
        println(latientClass)
    }
}

fun main() {
    val lazyClass = LazyClass()

    lazyClass.acceddLatientClass()
    lazyClass.acceddLatientClass()
}
