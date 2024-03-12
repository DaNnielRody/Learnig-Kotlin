package capstones.kotlinBasics

class CreditAccount(
    name: String,
    id: Int,
    amount: Int
) : BankAccount(name, id, amount) {

     fun creditDeposit(depositAmount: Int): Int{
        if(amount == 0){
            println("You don't need to deposit anything in order to pay off the account since it has already been paid off")
        }else if(amount + depositAmount > 0){
            println("Deposit failed, you tried to pay off an amount greater then credit balance. The checking balance is $amount dollars")
            return 0
        }else if(depositAmount == -amount){
            amount = 0
            println("You have paid off this account")
        }else{
            deposit(depositAmount)
        }
         return amount
    }
}