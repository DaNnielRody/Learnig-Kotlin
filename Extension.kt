
    private fun List<Int>.sum(): Int {
        var result = 0
        for (i in this) {
            result += i
        }
        return result
    }

    fun main(args: Array<String>) {
        val zap = listOf(1,2,3).sum()
        println(zap)    // 6
    }

    /*
    quando temos uma função de extensão, ela vira um "método" do tipo da classe.
    Como definimos o código acima como uma Lista de inteiros que "recebe" o método soma,
    agora quando chamamos lá embaixo no val a lista,
    podemos usar o método sum como nativo da classe - mas lembre-se de importá-la
     */
