package katas.basics

/*
Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.
 */

// o colchete determina a correspondência da classe.
fun replace(s: String): String = s.replace(Regex("[aeiouAEIOU]"), "!")