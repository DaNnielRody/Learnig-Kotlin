package katas.basics

/*
Grasshopper - Terminal game move function
 */

fun move(pos: Int, roll: Int) = pos + roll * 2

fun move2(pos: Int, roll: Int): Int {

    val rolling = roll * 2

    return rolling + pos
}