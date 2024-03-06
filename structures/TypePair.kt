package structures

/*
Em kotlin, temos a estrutura de pares e de triplos. Podemos acessálos definindo o seu tipo como Pair e atribuindo os valores,
e sucessivamente acessando-os a partir de suas propriedades (first, second, third).
 */

fun main() {
    val pair = Pair(1.0, 'A')
    println(pair.first) // 1.0
    println(pair.second) // A
    val (number, letter) = pair
    println(number) // 1.0
    println(letter) // A
}

/*
Contudo, uma outra maneira de fazer isso é utilizando o "to". Ao usar val pair = 1.0 to 'A' atribuímos estes valores a
um tipo pair.
 */

fun main2() {
    val pair = 1.0 to 'A'
    println(pair.first) // 1.0
    println(pair.second) // A
    val (number, letter) = pair
    println(number) // 1.0
    println(letter) // A
}