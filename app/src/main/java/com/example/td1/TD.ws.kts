//Ecrire une fonction qui affiche les x premiers nombres pairs ou impairs
fun pairImpair(S: String, x: Int): List<Int> {
    val numbers = mutableListOf<Int>()
    var i = 0
    while (numbers.size < x) {
        if (S == "pair" && i % 2 == 0) {
            numbers.add(i)
        } else if (S == "impair" && i % 2 != 0) {
            numbers.add(i)
        }
        i++
    }
    return numbers
}
pairImpair("pair", 10)

// Ecrire une fonction qui affiche les x premiers nombres de la suite Fibonacci à partir de 0.
fun fibonacci(x: Int): List<Int> {
    val numbers = mutableListOf(0, 1)
    while (numbers.size < x) {
        numbers.add(numbers[numbers.size - 1] + numbers[numbers.size - 2])
    }
    return numbers
}
fibonacci(10)

// Ecrire une fonction qui calcule le factoriel d’un nombre x, utiliser 10 par défaut si aucun nombre n’est spécifié.
fun factoriel(x: Int): Int {
    var result = 1
    var y = x;
    while (y > 1) {
        result *= y
        y--
    }
    return result
}
factoriel(5)

//- Ecrire une fonction qui affiche les x premiers nombres premiers
fun estPremier(x: Int): Boolean {
    if (x <= 1) {
        return false
    }
    for (i in 2 until x) {
        if (x % i == 0) {
            return false
        }
    }
    return true
}

fun numeroPremier(x: Int): List<Int> {
    val numbers = mutableListOf<Int>()
    var i = 2
    while (numbers.size < x) {
        if (estPremier(i)) {
            numbers.add(i)
        }
        i++
    }
    return numbers
}
numeroPremier(10)