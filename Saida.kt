
/*
private fun isValidIdentifier(s: String): Boolean {
    if (s.isEmpty() || s[0] in '0'..'9') {
        return false
    }

    return s.all { it in 'a'..'z' || it in 'A'..'Z' || it in '0'..'9' || it == '_' }
}
 */

private fun isValidIdentifier(s: String): Boolean {
        if (s.isEmpty() || s[0].isDigit()) return false
        return s.all { it.isLetterOrDigit() || it == '_' }
    }

    fun main(args: Array<String>) {
        println(isValidIdentifier("name"))   // true
        println(isValidIdentifier("_name"))  // true
        println(isValidIdentifier("_12"))    // true
        println(isValidIdentifier(""))       // false
        println(isValidIdentifier("012"))    // false
        println(isValidIdentifier("no$"))    // false
    }

    /*
    esse método s.all verifica se a condição dentro dele
    (it -> o caracter que está sendo verificado) está dentro de a e z ou A e Z,
     0 e 9 ou começa com _. Se a verificação não compraz com isso, é falso
     */