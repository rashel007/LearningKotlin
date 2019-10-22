package callicoder

/**
 * latient is used in kotlin so that we can declare the value later
 */
class LateinitClass {
    private lateinit var lateinitVariable: String

    fun setLateinitVariable(value: String) {
        lateinitVariable = value
    }

    fun getLateinitVariable(): String {

        return lateinitVariable
    }

    fun getLateinitVariableSafe(): String {
        return if (this::lateinitVariable.isInitialized) lateinitVariable else "default"
    }

}


fun main() {
    val lateinitClass = LateinitClass()

    // this will give us an error saying lateinit variable not initialized
    print(lateinitClass.getLateinitVariable())

    // we can call get without initialize lateinit variable
    print(lateinitClass.getLateinitVariableSafe())
}