package typeOfClasses

/*
Classes do tipo annotation não fazem nada particularmente, apenas servem para documentação e informação.
Contudo, imagine um cenário onde você faz uma biblioteca e decide usar um método mais eficaz que o anterior,
o que aconteceria com o acesso ao método anterior?
Nesse caso, você poderia usar uma annotation depreced para avisar que está depreciada e tem novas maneiras de fazer isso.
Você já deve ter se deparado em um cenário de fazer um curso mais antigo que utiliza esse método, e o intellij te avisar
que é um método depreciado. Isso só é possível graças o annotation.
 */

annotation class MyAnnotation(val someDescription: String)

@MyAnnotation("Class annotation")
class A(
    @MyAnnotation("Constructor property annotation")
val a: Int
) {
    @MyAnnotation("Method annotation")
    fun b() {}
}