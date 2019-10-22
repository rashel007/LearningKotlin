package callicoder.inheritance

/**
 * BankAcount (Base Class)
 * @property accountNumber - Account Number (read-only)
 * @property accountName - Account Name (read-only)
 * @property balance  - Current Balance (Mutable)
 */

open class BankAccount(accountNumber: String, accountName: String) {


    var balance: Double = 0.0


    fun depositeMoney(amount: Double): Boolean {

        if (amount > 0) {
            balance += amount
            return true
        }

        return false
    }


    fun withdrawMoney(amount: Double): Boolean {

        if (amount <= balance) {
            balance -= amount
            return true
        }

        return false
    }

    open fun printMessage() {
        println("BackAccount Saved")
    }
}