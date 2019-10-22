package callicoder.inheritance

fun main() {
    val savingAccount = SavingAccount("Rashel", "222843", 8.0)

    savingAccount.depositeMoney(80000.0)
    println("Current Balance = ${savingAccount.balance}")
    savingAccount.depositeInterest()

    println("Current Balance = ${savingAccount.balance}")

    savingAccount.printMessage()
}