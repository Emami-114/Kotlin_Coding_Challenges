/**Schreibe eine Funktion, die als Parameter einen positiven Integer übergeben bekommt
und anschließend die Summe der ersten n Primzahlen zurückliefert.

## Hinweis

- Eine Primzahl ist eine natürliche Zahl, die größer als 1 ist und <ins>nur</ins> durch 1 und sich selbst teilbar ist
- Du kannst gerne neue Hilfsfunktion(en) benutzen

## Beispiel

```kotlin
val summe = sumOfPrimes(5)
println(summe) // 28
```*/

fun main() {
    println(sumOfPrimes(5))  // Erwartetes Ergebnis:   28 (2 + 3 + 5 + 7 + 11 = 28)
    println(sumOfPrimes(10)) // Erwartetes Ergebnis:   129 (2 + 3 + 5 + 7 + 11 + 13 + 17 + 19 + 23 + 29 = 129)
}

/*
Schreibe eine Kotlin Funktion, die als Parameter einen positiven Integer übergeben bekommt
und anschließend die Summe der ersten n Primzahlen zurückliefert.

Hinweis:

- Eine Primzahl ist eine natürliche Zahl, die größer als 1 ist und nur durch 1 und sich selbst teilbar ist
 */
fun sumOfPrimes(n: Int): Int {
    var sum = 0  // Variable zur Speicherung der Summe der Primzahlen
    var count = 0  // Variable zur Zählung der gefundenen Primzahlen
    var number = 2  // Startzahl für die Suche nach Primzahlen

    while (count < n) {  // Solange die gewünschte Anzahl an Primzahlen noch nicht erreicht ist
        if (isPrime(number)) {  // Überprüfe, ob die Zahl eine Primzahl ist
            sum += number  // Addiere die Primzahl zur Summe
            count++  // Erhöhe den Zähler für gefundene Primzahlen um eins
        }
        number++  // Gehe zur nächsten Zahl
    }

    return sum  // Gib die Summe der Primzahlen zurück
}


fun isPrime(number: Int): Boolean {
    if (number < 2) {  // Zahlen kleiner als 2 sind keine Primzahlen
        return false
    }
    for (i in 2 until number) {  // Iteriere über alle Zahlen von 2 bis zur Zahl selbst (exklusive)
        if (number % i == 0) {  // Überprüfe, ob die Zahl ohne Rest durch i teilbar ist
            return false  // Falls ja, ist sie keine Primzahl
        }
    }
    return true  // Wenn keine Teilbarkeit gefunden wurde, ist die Zahl eine Primzahl
}
