package capstones.kotlinBasics

open class BankAccount(
    private var name: String,
    private var id: Int,
    var amount: Int = 0
) {

    private fun cheer(){
        println("Welcome to your banking system")
    }

    private fun createAccount(): AccountType {
        cheer()

        println("What type of account would you like to create?")

        val userChoice: AccountType?

        println(
                """
            1 - Debit account
            2 - Credit account
            3 - Checking account
                """.trimIndent()
            )

            val userInput = readln()
            userChoice = when (userInput) {
                "1" -> AccountType.DEBIT
                "2" -> AccountType.CREDIT
                "3" -> AccountType.CHECKING
                else -> {
                    println("Wrong Input")
                    null
                }
            }

        return userChoice ?: throw IllegalArgumentException("Invalid account choice")
    }

    fun createdAccount(){
        val accountType = createAccount()
        // para acessar o nome do ENUM você precisa da instância da classe:
        print("You have created a ${accountType.name.lowercase()} account")
    }

    //tornando open para ser possível sobrescrever
    open fun withdraw(withdrawAmount: Int){
        if(amount == 0){
            println("Can't withdrawn, no money on this account.")
        }else if(amount < withdrawAmount) {
            println("Insufficient amount.")
        }else{
            amount -= withdrawAmount
            println("The amount you withdrew is $withdrawAmount dollars")
        }
    }

    //tornando open para ser possível sobrescrever
    open fun deposit(depositAmount: Int){
        if(depositAmount > 0){
            amount += depositAmount
            println("The amount you deposited is $depositAmount dollars")
        }else{
            println("Please, deposit ")
        }
    }
}