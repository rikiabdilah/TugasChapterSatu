package Latihan4Pilar

class BankAccount(var balance : Double){
    fun deposit (hitung:Double){
        balance += hitung
    }
    fun withdraw(hitung: Double){
        if (balance >= hitung){
            balance -= hitung   
        } else{
            println("Insufficient balance")
        }
    }
}

fun main() {
    val account = BankAccount(100.0)
    account.deposit(50.0)
    println(account.balance)

    account.withdraw(75.0)
    println(account.balance)

    account.withdraw(100.0)
}