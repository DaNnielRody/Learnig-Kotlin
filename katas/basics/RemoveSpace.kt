package katas.basics

/*
Write a function that removes the spaces from the string, then return the resultant string.
 */

fun noSpace(x: String) = x.filter { !it.isWhitespace() } // só retorna o que não for espaço em branco

fun noSpace2(x: String) = x.replace(" ", "")

fun main(){
    println(noSpace("8aaaaa dddd r     "))
}