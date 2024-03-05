package oop

/*
Polimorfismo é o conceito de que diferentes classes podem ter o mesmo tratamento em seus objetos.
Por exemplo, temos uma interface animal que vai ser implementada por Gato, Cachorro, entre outros.
Eles vão utilizar os mesmos atributos, porém, para usos diferentes e com valores diferentes, porém, seus métodos e
parâmetros esperam receber argumentos parecidos.
 */

interface Animal {
    val breed: String
    fun pet()
    fun roar()
}

class Dog(
    private val name: String,
    override val breed: String
) : Animal {
    override fun pet() {
        println("I'm $name, and I'm a $breed dog")
    }

    override fun roar() {
        println("Ruff Ruff")
    }
}

class Cat(
    private val name: String,
    override val breed: String
) : Animal {
    override fun pet() {
        //println("I'm $name, and I'm a ${this.breed} cat")
        println("I'm $name, and I'm a $breed cat")
    }

    override fun roar() {
        println("Meow")
    }
}

// is é uma condição smart-casting, que permite verificar o tipo do animal evitando erros, podendo nos deixar livres para mexer em seu escopo
// neste código por exemplo, verificamos que cada animal é de um tipo, e se for, convertemos a propriedade de maneira segura:
fun Any.play() {
    when (this) {
        is Dog -> println("Throwing the ball")
        is Cat -> println("Push the feather")
        else -> println("Unknown animal, cannot play")
    }
}

fun main(){
    val cat = Cat("Jake", "Munchkin")
    val dog = Dog("Cookie", "Border Collie")


    cat.pet()
    cat.roar()
    cat.play()

    dog.pet()
    dog.roar()
    dog.play()

    // Como dog implementa Animal, podemos chamar dog a partir de animal que ele reconhece:
    val animal: Animal = dog
    animal.roar()
}