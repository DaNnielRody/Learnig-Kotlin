package katas.basics

/*
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces.
 */

fun getCount(str : String) : Int {
    var count = 0
    for (char in str) {
        when (char) {
            'a', 'e', 'i', 'o', 'u' -> count++
        }
    }
    return count
}

fun getCount2(str : String) = str.count { it in "aeiou" }

fun getCount3(str: String): Int {
    val vowel = charArrayOf('a', 'e', 'i', 'o', 'u')
    return str.count { it in vowel }
}

