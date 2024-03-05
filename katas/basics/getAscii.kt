package katas.basics

/*
Para converter um valor ascii em número, podemos pegar o valor e fazer a conversão para número.
Porém, é bom deixar claro que strings e caracteres são mutáveis, então é melhor utilizar o c.code que
acaba por não quebrar o encoding (qualquer alteração de string não modifica ela, mas cria uma nova)
 */

fun getAscii(c: Char): Int {
    return c.code;
}