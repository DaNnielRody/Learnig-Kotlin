package structures

/*
Prosseguindo no assunto de coleções, podemos citar os prós e contras de cada uma.

Por exemplo, como visto anteriormente, uma lista do tipo List. Se tivermos um valor definido e imutável, podemos utilizá-lo apenas para
fazer consulta, por exemplo (produtos para uma compra ou métodos de entrega). Listas também sempre exibem seu conteúdo da
mesma forma como foram definidos durante a criação.
Dentro de listas, temos Arraylist que é ótimo para achar elementos, e as LinkedLists que são melhores em adicionar ou remover
elementos.

Porém, temos também o tipo Set. Set é um conjunto de elementos fora de ordem, que não permite duplicatas. Um ponto positivo
para ele é que conseguimos fazer consultas mais rapidamentes num Set que em uma lista. Podemos utilizá-lo em um banco de dados de
nome de usuário, não permitindo que um usuário tenha o mesmo nome que o outro - isso sem se importar com a ordem.

Também tempos o tipo Map. Map é um tipo de conjuntos que mantem uma coleção de chave-valor. Chaves são únicas, embora
os seus valores podem ser duplicados. Por exemplo - continuando com o exemplo do banco de dados - o ID de um funcionário ao
lado do seu nome. Nesse sentido, podemos ter funcionários com o mesmo nome, porém, com ID's únicos que os diferenciam. Por exemplo, se tivermos uma situação como:

fun main() {
    val m = mapOf('a' to "Alex", 'a' to "Anna")
    print(m)
}

Ele vai imprimir a = Anna, por conta dos Id's únicos.

Outros exemplos de Map:

fun main() {
    val capitals = mapOf("USA" to "Washington", "Poland" to "Warsaw", "Ukraine" to "Kyiv")
    //    val capitals = mapOf(
    //        Pair("USA", "Washington"),
    //        Pair("Poland", "Warsaw"),
    //        Pair("Ukraine", "Kyiv")
    //    )
    println(capitals) // {USA=Washington, Poland=Warsaw, Ukraine=Kyiv}
}
fun main() {
    val capitals: Map<String, String> =
        mapOf("USA" to "Washington", "Poland" to "Warsaw", "Ukraine" to "Kyiv")

    println(capitals) // {USA=Washington, Poland=Warsaw, Ukraine=Kyiv}

    val alphabet: Map<Char, Int> = mapOf('A' to 1, 'B' to 2, 'C' to 3)

    println(alphabet) // {A=1, B=2, C=3}
}
 */


fun main(){
    // Vimos anteriormente que listas assim como strings são imutáveis, porém, podemos assumir a lista como mutável!

    val list = mutableListOf("A", "B", "C")
    list.add("D") // adiciona normalmente, sem ter que criar outro objeto e mesmo sendo val.
    println(list)
}