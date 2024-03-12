package typeOfClasses

/*
Quando precisamos utilizar um cenário simples para mexer com dados, podemos utilizar o tipo data em relação aos outros
tipos de declaração de classe.
 */

data class Dog(
    val name: String,
    val age: Int
)

/*
Objetos são únicos. Então quando criamos uma classe e a instanciamos, mesmo que os valores sejam exatamente os mesmos
o endereçamento de memória muda, então eles são considerados objetos únicos e diferentes.
Contudo, ao usar o "data" como atributo da classe, se houver uma instância de um objeto com os mesmos valores e você
fizer uma comparação de valor de propriedade (isto é, "=="), ele retornará como true. Isto acontece porque ele fornece
uma implementação equals que compara o valor de propriedades, fazendo com que ele retorne true para objetos de valores
iguais, contudo, se você comparar o valor de identidade ("==="), ele continuará falso porque objetos são únicos.
 */
fun main(){
    val dog = Dog("Cookie", 1)
    val dog2 = Dog("Cook", 1)
    val dog3 = Dog("Cookie", 1)


    println(dog == dog2)
    println(dog == dog3)
    println(dog === dog3)


    /*
    Outra implementação é a partir da desestruturação - colocando o valor entre parênteses e atribuíndo a uma classe ou objeto.
    Em kotlin, podemos usá-la para lidar com um ou mais valores.
    Neste caso, podemos separar as suas propriedades dentro de uma variável,
    e atribuir à variável que já foi criada para lermos o seu nome e idade sem que precisemos acessar da forma clássica
    como dog.name e dog.age.
    É importante ressaltar que ela precisa corresponder à ordem das propriedades da classe. Se eu coloquei a data classe
    com name e age, então para acessá-la, devo obedecer a sua ordem - contudo, ela não precisa necessariamente obedecer
    ao mesmo nome de propriedade. Por exemplo, a partir de name e age, eu poderia declarar a variável como:
    val (firstName, animalAge) que o código compilaria da mesma forma.
     */

    val (name, age) = dog2
    println(name)
    println(age)

    /*
    Caso queira modificar um atributo específico, podemos usar o "copy" a partir do objeto criado. No caso, ele vai criar um
    novo objeto e o anterior continuará com o mesmo resultado.
     */

    val newDog = dog.copy(age = 4)
    println(newDog)
}