package katas.basics

/*
I have a cat and a dog.

I got them at the same time as kitten/puppy. That was humanYears years ago.

Return their respective ages now as [humanYears,catYears,dogYears]

Cat Years
15 cat years for first year
+9 cat years for second year
+4 cat years for each year after that

Dog Years
15 dog years for first year
+9 dog years for second year
+5 dog years for each year after that
 */
fun calculateYears(years: Int): Array<Int> {

    //como os anos de humanos não mudam, podemos declarar a própria variável como sendo ela mesma e contabilizar apenas gato e cachorro

    var catYear = 0
    var dogYear = 0

    if(years == 1){
        catYear += 15
        dogYear += 15
    }else if(years == 2){
        catYear += 15 + 9
        dogYear += 15 + 9
    }else if(years > 2){

        /*
        Como precisamos adicionar 4 anos para cada ano após o 2, precisamos ter em mente que:
        se são 3 anos, seria 4 * 1. Então, como a condição só entra quando os anos forem maiores que 2, precisamos subtrair
        esse 2 para garantir que a contagem seja certa:
         */
        catYear += (15 + 9) + (4 * (years - 2))
        dogYear += (15 + 9) + (5 * (years - 2))
    }

    return arrayOf(years, catYear, dogYear);
}

fun calculateYears2(years: Int): Array<Int> =
    when(years){
        1 -> arrayOf(years, 15, 15)
        2 -> arrayOf(years, 24, 24)
        else -> arrayOf(years, 24 + (4 * (years - 2)), 24 + (5 * (years - 2)))
    }
