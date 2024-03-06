package typeOfClasses


/*
Exceções são utilizadas quando queremos evitar que algum erro pare o código.
Por exemplo, se eu transformar uma String ABC em um númeto e printá-lo, terei um erro de compilação.
Contudo, se colocar dentro de um bloco try-catch, o programa avisa que o erro foi acionado, porém, te retorna uma
saída ao invés de um erro, e ainda retorna a saída de "Done" - um cenário que não aconteceria fora de um bloco try-catch.
 */


/*
Quando você declara uma classe herdando a Throwable, ela pode ser usada para lançar exceções personalizadas.
 */
class MyError: Throwable("Some message")

fun someFunction() {
    throw MyError()
    //println("Will not be printed")
}

fun main2() {
    someFunction()
    println("Will not be printed")
}

fun main(){
    try{
        val num: Int = "ABC".toInt()
        println(num)
        /*
        Utilizamos Throwable, porque ela é a superclasse dos tipos de exceções. Por exemplo, podemos especificar o tipo
        de exceção que estamos esperando, porém, caso não receba esse tipo, o código vai parar novamente.
        Podemos fazer diversos blocos de catch com as devidas saídas para cada caso, contudo, ele retorna o primeiro
        caso em que cair. Como Throwable abrange todos os casos, a exceção vai parar aqui, contudo, se houvessem casos
        específicos (como NumberFormat ou Arithmetic) eles retornariam o seu caso dada a situação em que se encontrarem.

        Também podemos retornar um código de erro mais personalizado a partir dos métodos de extensão do seu parâmetro
        Throwable. Por exemplo, podemos utilizar a message para verificar a mensagem de erro que sairia:
         */
    }catch (t: Throwable){
        println("Gotcha ${t.message}")

        /*
        Temos também a opção finally, que acontece independentemente de haver ou não uma ocorrência de exceção:
         */
    }finally {
        println("Got here")
    }
    println("Done")
}