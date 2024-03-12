package structures

/*
O conceito de null é simples: Imagine que você tem um jardim e o lugar exato para plantar uma flor, porém, ainda não o fez.
Enquanto a flor não está plantada, é null, e após isso, ela será o seu tipo.
 */

fun main(){
    /*
    Se quisermos atribuir um valor num a um tipo antes de especificar, precisamos utilizar o "?" na frente:

    isso também funciona para parâmetro de função:

    fun isNull(name: String?)

    e classes:

    class User(val name: String) var user: User? = null
     */
    var plant: String? = null
    println(plant)

    // e depois mudamos:
    plant = "Orquídeas"
    println(plant)

    /*
    Também temos que ter cuidado com o erro NPE (null type) se acessamos indevidamente. Por exemplo, se quiséssemos retornar
    o length de plant antes de ser orquídea, ele retornaria esse erro. Contudo, podemos fazer uma safe call, que é o seguinte:
     */

    var message: String? = "Oi Github" // criamos a variável podendo receber string ou null
    println(message?.length) // chamamos uma função usando o safe call (com o ? na frente) que retorna o valor
    message = null // agora mudamos o seu valor para null
    println(message?.length) // usamos o safe call novamente para evitar que aponte o erro, mas que imprima "null"
}