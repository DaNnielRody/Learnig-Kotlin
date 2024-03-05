package katas.basics

class Kata {

    fun makeNegative(x: Int): Int {
        return when{
            x < 0 -> x
            x > 0 -> -x
            else -> 0
        }
    }
}