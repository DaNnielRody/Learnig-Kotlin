package katas.basics

/*
Given three integers a ,b ,c, return the largest number obtained after inserting the following operators and brackets: +, *, ()
In other words , try every combination of a,b,c with [*+()] , and return the Maximum Obtained
 */
fun expressionsMatter(a: Int, b: Int, c: Int): Int {
    val options = listOf(
        a + b + c,
        a * (b + c),
        a * b * c,
        a + b * c,
        (a + b) * c
    )
    return options.maxOrNull() ?: 0
}

fun expressionsMatter2(a: Int, b: Int, c: Int) = maxOf(a * b * c, a + b + c, (a + b) * c, a * (b + c))



fun main(){
    println(expressionsMatter(1,1,1))
}
