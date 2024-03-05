package oop

import javax.print.DocFlavor.STRING

/*
Quando tratamos herança, temos que deixar a classe pai aberta para poder ser herdada. Quando herdamos, podemos separar
os parâmetros do filho e informar o parâmetro do pai através do argumento (nos parênteses).
Então ao herdar a classe animal - que seria um cachorro, ele herda a raça de labrador,
e assim quando é chamado, consta a raça e o seu nome.
Caso eu queira mudar a raça, poderia receber também o parâmetro override na classe filho, e um parâmetro
open ou abstract da classe pai.
Vale ressaltar que com Open ele pode ser instanciado e fazer o down-casting chamando o filho, mas como
abstrata não.

Quando herdamos uma classe, a subclasse herda todos os métodos da classe pai (por isso ele consegue usar zap sem
precisar de override).
No caso também, se eu tiver uma classe pai A, que estende B, onde B estende C; C conseguiria usar tanto os métodos de
A, B, e os seus próprios em C (a não ser que esses métodos sejam privados)
 */

//abstract ou open
open class Animall(
    val breed: String
){
    fun zap(){
        print("zap")
    }
}

class Dogg(
    val name: String
) : Animall("Labrador")

fun main(){
    val lab = Dogg("Zapinho")
    println(lab.name)
    println(lab.breed)
    lab.zap()
}

