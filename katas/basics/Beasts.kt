package katas.basics

/*
All the animals are having a feast! Each animal is bringing one dish.
There is just one rule: the dish must start and end with the same letters as the animal's name.
For example, the great blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.

Write a function feast that takes the animal's name and dish as arguments and returns true or false to indicate
whether the beast is allowed to bring the dish to the feast.

Assume that beast and dish are always lowercase strings, and that each has at least two letters.
beast and dish may contain hyphens and spaces, but these will not appear at the beginning or end of the string.
They will not contain numerals.
 */

fun feast(beast: String, dish: String): Boolean {
    return beast[0] == dish[0] && beast[beast.length - 1] == dish[dish.length - 1]
}

fun feast2(beast: String, dish: String): Boolean {
    return beast.startsWith(dish[0]) && beast.endsWith(dish[dish.length - 1])
}

fun feast3(beast: String, dish: String) = beast.first() == dish.first() && beast.last() == dish.last()

fun main(){
    val zap = feast("great blue heron", "garlic naan")
    println(zap)
}

/*
fun feast(beast: String, dish: String) = beast.startEnd() == dish.startEnd()

fun String.startEnd(): Pair<Char, Char> {
    return Pair(this[0], this[lastIndex])
}
 */