/**## Fehlende Zahlen

```
Finde die fehlenden Zahlen in einer gegebenen Liste
von aufeinanderfolgenden Zahlen!
```

```
In einer Liste von aufeinanderfolgenden Zahlen fehlen
einige Zahlen.

Deine Aufgabe besteht darin, ein Programm zu schreiben,
das die fehlenden Zahlen einer List erkennt und zurückgibt.

Hinweise:
- Die Liste kann sowohl aufsteigend als auch absteigend sortiert sein.
- Die Liste kann sowohl positive als auch negative Zahlen enthalten.
- Es können eine oder mehrere Zahlen in der Liste fehlen.

```

Schreibe eine Funktion `findMissingNumbers()`, die eine Liste von
aufeinanderfolgenden Zahlen als Parameter erhält und die fehlenden Zahlen erkennt.

### Parameter

- `numbers` - Eine Liste von aufeinanderfolgenden Zahlen.

### Rückgabewert/Ausgabe

- Eine Liste der fehlenden Zahlen in der gegebenen Liste.

### Beispiel

```kotlin
val numbers = listOf(1, 2, 4, 7, 8, 10)
val missingNumbers = findMissingNumbers(numbers)

println("Die fehlenden Zahlen in der Liste $numbers " sind: $missingNumbers.")
```

#### Tipp:
Du kannst die Funktionen `min()` und `max()` aus der Kotlin-Standardbibliothek verwenden

 */


fun main() {

    //hier kann getestet werden
    println(findMissingNumbers(listOf(1,3,6,9,)))
}

fun findMissingNumbers(numbers: List<Int>): List<Int> {
    val minNumber = numbers.min()
    val maxNumber = numbers.max()
    val allNumbers = (minNumber..maxNumber).toList()
    return allNumbers.filterNot { it in numbers }

}