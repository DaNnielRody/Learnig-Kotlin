package capstones.kotlinBasics

import java.util.Scanner

class Menu {
    companion object {
        fun start() {
            val scanner = Scanner(System.`in`)
            var isSystemOpen = true
            var bankAccount: BankAccount? = null

            while (isSystemOpen) {
                println("""
                    What would you like to do?
                    1. Check bank account balance
                    2. Withdraw money
                    3. Deposit money
                    4. Close the app
                    Which option do you choose? (1, 2, 3, or 4)
                """.trimIndent())

                val option = scanner.nextInt()

                when (option) {
                    1 -> {
                        if (bankAccount != null) {
                            println("Current bank account balance: ${bankAccount.amount}")
                        } else {
                            println("Please create a bank account first.")
                        }
                    }
                    2 -> {
                        if (bankAccount != null) {
                            println("Enter the amount you want to withdraw:")
                            val withdrawAmount = scanner.nextInt()
                            bankAccount.withdraw(withdrawAmount)
                        } else {
                            println("Please create a bank account first.")
                        }
                    }
                    3 -> {
                        if (bankAccount != null) {
                            if (bankAccount is CreditAccount) {
                                println("Enter the amount you want to deposit:")
                                val depositAmount = scanner.nextInt()
                                bankAccount.creditDeposit(depositAmount)
                            } else {
                                println("Enter the amount you want to deposit:")
                                val depositAmount = scanner.nextInt()
                                bankAccount.deposit(depositAmount)
                            }
                        } else {
                            println("Please create a bank account first.")
                        }
                    }
                    4 -> {
                        isSystemOpen = false
                        println("App closed.")
                    }
                    else -> println("Invalid option. Please choose a valid option.")
                }

                // Verifica se a conta bancária foi criada e cria uma nova se necessário
                if (bankAccount == null) {
                    bankAccount = createBankAccount()
                }
            }

            scanner.close()
        }

        private fun createBankAccount(): BankAccount {
            val scanner = Scanner(System.`in`)
            println("Hello, what is your name: ")
            val nameInput = scanner.nextLine()
            println("What is your ID: ")
            val idInput = scanner.nextInt()

            val newBankAccount = BankAccount(nameInput, idInput, 0)
            newBankAccount.createdAccount() // Chama a função para criar a conta
            return newBankAccount
        }
    }
}

fun main() {
    Menu.start()
}
