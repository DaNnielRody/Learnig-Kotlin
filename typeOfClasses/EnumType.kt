package typeOfClasses

/*
Enum é um tipo de classe que representa uma série de possíveis valores.
Esses valores podem variar desde métodos de pagamento até uma série de cores para que você acesse.

Podemos ressaltar também que ele é facilmente printável. Se acessarmos a sua propriedade como
PaymentMethod.CASH, ele printará "CASH" ao invés de um objeto - como em classes - ou seus valores como em data classes.
 */

enum class PaymentMethod {
    CASH,
    CREDIT,
    DEBIT,
    PIX
}

enum class WeekDay {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

/*
Enums também podem ter construtores, e assim receber valores em seus parâmetros para serem chamados.
Neste caso, podemos fazer uma função que especifica o tamanho de cada pizza e chamar PizzaSize.Tamanho para vermos a
sua saída.
 */

enum class PizzaSize(
    val sizeInCm: Int
) {
    SMALL(15),
    MEDIUM(20),
    LARGE(25),
    EXTRALARGE(30)
}

fun main(){
    val input: String = "CASH"

    /*

    Podemos acessar facilmente as suas propriedades, e elas também são facilmente manipuladas como strings.

    when(input){
        PaymentMethod.valueOf(input) -> println("The value is Cash")
        PaymentMethod.valueOf(input) -> TODO()
        PaymentMethod.valueOf(input) -> TODO()
        PaymentMethod.valueOf(input) -> TODO()
    }

    Contudo, é válido afirmar que você deve escrever da maneira exata como foi declarada no Enum.
    No caso, como todas são escritas em Uppercase, a string também deve ser escrita assim, caso contrário teremos erros.
     */

    val string1 = "CASH"
    val methodd = PaymentMethod.valueOf(string1)
    println(methodd)

    /*
    Enums têm essa propriedade ordinal, que mostra a posição na classe. Começando no 0 - o valor de CASH - podemos chegar
    até 3 com o valor de PIX.
     */

    println(PaymentMethod.CASH.ordinal)
    println(PaymentMethod.CREDIT.ordinal)
    println(PaymentMethod.DEBIT.ordinal)
    println(PaymentMethod.PIX.ordinal)

    /*
    E também podemos iterar facilmente os valores de um Enum, da seguinte form:
    (também poderiamos usar o values, porém, desde a versão 1.9 utilizamos o entries)
     */

    for(method in PaymentMethod.entries){
        println("At ${method.ordinal} there is $method")
    }
}