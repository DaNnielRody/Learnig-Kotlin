fun printSurrounded(value: String = "", prefix: String = "<", postfix: String = ">") {

    println("$prefix$value$postfix")
}

fun main() {
    printSurrounded(postfix = ".")
}

/*
Podemos tanto especificar abertamente para fazer a alteração de um argumento que já foi definito como default,
em qualquer ordem (desde que especifiquemos) - no caso, ele mostra que está mudando o postfix
 */

fun printSurrounded2(value: String = "", prefix: String = "<", postfix: String = ">") {
    println("$prefix$value$postfix")
}

fun mainm() {
    printSurrounded("ABC", ".")
}

/*
Como também podemos apenas seguir a ordem em que foi determinada nos parâmetros da função.
 */


