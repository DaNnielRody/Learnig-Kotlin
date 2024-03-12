package structures

/*
Coleções são estruturas utilizadas para facilitar a manilação com dados dentro das linguagens.
 */

fun main(){
    val mallList = listOf(
        "Arroz",
        "Feijão",
        "Batata"
    )

    println(mallList) // uma coleção como lista, pode ser printada como se fosse uma string,

    for(element in mallList){
        println(element) // como também pode ser percorrida em um laço de for.
    }

    println(mallList.size) // também podemos acessar o seu tamanho com size, ao invés de length.

    val newMallList = mallList - "Arroz" + "Frango" // assim como strings, coleções não podem ser alteradas, porém, podemos criar novas com a antiga lista como base.
    println(newMallList) // Feijão, Batata, Frango
}

