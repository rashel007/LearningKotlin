package callicoder.inheritance

/**
 * SavingAccount (Child / Derived Class)
 * @property interestRate - Interest Rate for Saving Account
 * @constructor - Primary constructor for creating a saving account
 * @param accountName - Account Name (used to initialize BankAccount)
 * @param acountNumber - Account Number (used to initialize BankAccount)
 */
class SavingAccount(accountName: String, accountNumber: String, val interestRate: Double) :
    BankAccount(accountNumber, accountName) {

    fun depositeInterest() {
        val interest = balance * interestRate / 100
        this.depositeMoney(interest)
    }

    // override base class function
    override fun printMessage() {
        println("Saving Account Saved")
    }

}