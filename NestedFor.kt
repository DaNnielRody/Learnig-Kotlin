fun main() {

    /*
    o primeiro for é como se fosse a coluna, e o segundo é como se fosse a linha,
    por isso que ele pega o primeiro valor e determina que vai ir até 10, mas no segundo for
    ele printa do 1 até a posição na coluna:
    coluna 1 -> 1 linha (1..1)
    coluna 2 -> 2 linhas (1.2)
    a linha segue a posição da coluna
     */
    val height = 10
    for (i in 1..height) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}

/*
val height = 5
    for (i in height downTo 1) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
 */