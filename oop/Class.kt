package oop

/*
Podemos definir os valores dentro dos parênteses, e depois o corpo e métodos da função nos brackets:
 */

class Employee(
    private val name: String,
    private val position: String
) {
    fun printEmployee(){
        println("$name is $position")
    }
}

fun main(){
    val employee = Employee("Alex", "Manager")
    employee.printEmployee()
}