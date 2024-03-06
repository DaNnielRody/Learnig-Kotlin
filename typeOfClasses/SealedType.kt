package typeOfClasses

/*
Uma classe sealed tem suas similaridades com a abstract, porém, uma classe selada tem um número limitado de subclasses
herdadas dela.
No caso, todas as subclasses de uma classe selada devem ser declaradas no mesmo arquivo em que a classe selada está definida.
Isso garante que o compilador tenha conhecimento de todos os possíveis tipos derivados da classe selada.

Por padrão, os modificadores de acesso são sempre privados, então esses membros herdados de classes seladas não podem ser
modificados.
 */

sealed class Role
class CeoRole(): Role()
class ManagerRole(val name: String): Role()
class WorkerRole(val name: String): Role()

fun constructLabel(role: Role): String {
    /*
    Assim como os Enums, se percorrermos todos os valores possíveis da classe selada no when, não precisamos adicionar
    um "else".
     */
    return when (role) {
        is CeoRole -> "The boss"
        is ManagerRole -> "Manager ${role.name}"
        is WorkerRole -> role.name
    }
}

fun main() {
    val label = constructLabel(ManagerRole("Leonard"))
    println(label)
}