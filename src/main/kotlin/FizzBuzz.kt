fun main() {
    val list = (1..100).toList()
    fizzBuzz(list)
    fizzBuzz2(list)
}


/**
Schreibe eine Funktion, die eine Liste von Zahlen erhält und für jede Zahl in der Liste eine Ausgabe generiert, abhängig von der folgenden Regeln:
Wenn die Zahl durch 3 teilbar ist, soll "Fizz" ausgegeben werden.
Wenn die Zahl durch 5 teilbar ist, soll "Buzz" ausgegeben werden.
Wenn die Zahl durch 3 und 5 teilbar ist, soll "FizzBuzz" ausgegeben werden.
Wenn die Zahl nicht durch 3 oder 5 teilbar ist, soll die Zahl ausgegeben werden.
 */


fun fizzBuzz(list: List<Int>) {

    for (i in list) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else println("$i")

    }
}


fun fizzBuzz2(list: List<Int>) {
    for (i in list) {
        when {
            i % 3 == 0 && i % 5 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }

}