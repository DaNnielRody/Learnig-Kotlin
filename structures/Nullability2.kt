package structures

/*
Sei que já foi falado como acessar e atribuir parâmetros e tipos que podem receber null, porém, eles não podem acessar
valores de classe. Como assim? Vou mostrar.

Suponha uma classe usuária e uma classe que aceita tanto usuário quanto null, o que aconteceria se ele tentasse acessar os
seus valores? Vamos descobrir.
 */

class User(
    val name: String
){
    fun cheer(){
        println("Bom te conhecer, $name")
    }
}

fun printUserNameNull(user: User?){
    //print(user.name)
   //user.cheer()
}

/*
Como pode ser visto, quando utilizamos assim, a própria IDE aponta erros.

Contudo, se utilizarmos a safe call vista anteriormente, ela funciona perfeitamente. Teste aí:

fun printUserName(user: User?){
    print(user?.name)
    user?.cheer()
}

De quê outras maneiras podemos lidar com a nulabilidade?

Temos uma opção insegura, onde colocamos dois pontos de exclamação:
 */

fun printUserName(user: User?){
    print(user!!.name)
    user.cheer()
}

/*
Temos a forma smart casting de fazer, que verifica a sua nulabilidade antes de fazer a requisição:

smart-casting é a capacidade de mudar o tipo da variável dentro de um escopo específico - quando o Kotlin consegue
determinar que tipo se encontra nesse escopo.
 */
fun printUserName2(user: User?){
    if(user != null){
        print(user.name)
        user.cheer()
    }else{
        println("Usuário é null")
    }
}

/*
Por último, temos a forma utilizando o operador elvis, que vai ser tratado de maneira específica futuramente:
 */

fun printUserName3(user: User?){
    val userDefault: User = user ?: User("(undefined)")
    println(userDefault.name)
    userDefault.cheer()
}

fun main(){

    printUserName(null) // a IDE não aponta nada, porém, se chamarmos null aqui, ela lança um erro NPE.
    printUserName2(null) // agora não acontece nada.
    printUserName3(null) // agora é undefined.
}