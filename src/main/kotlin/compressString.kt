/**
 * ## Zeichenfolgenkürzung
 *
 * ```
 * Kürze eine gegebene lange Zeichenfolge, indem du aufeinanderfolgende gleiche Zeichen durch die Anzahl der Wiederholungen und das Zeichen selbst ersetzt.
 * ```
 * Zum Beispiel wird die Zeichenfolge `"aaaabbbcc"` zu `"4a3b2c"`.
 * ```
 * In vielen Fällen besteht eine Zeichenfolge aus aufeinanderfolgenden gleichen Zeichen. Um die Zeichenfolge zu komprimieren, geht man wie folgt vor:
 *
 * 1. Zähle die Anzahl der Wiederholungen für jedes Zeichen in der Zeichenfolge.
 * 2. Ersetze dann die aufeinanderfolgenden gleichen Zeichen durch die Anzahl der Wiederholungen gefolgt vom entsprechenden Zeichen.
 *
 * Auf diese Weise verkürzt sich die Zeichenfolge, da die Informationen über die Wiederholungen in einer kompakteren Form gespeichert werden.
 * Indem du diese Schritte befolgst, kannst du die gegebene Zeichenfolge effektiv komprimieren und die resultierende komprimierte Zeichenfolge erhalten.
 *
 * Hinweise:
 *
 * - Der Einfachheit halber besteht die Zeichenkette nur aus Kleinbuchstaben.
 * - Beachte, dass nur aufeinanderfolgende gleiche Zeichen komprimiert werden sollen.
 * ```
 *
 * Schreibe eine Funktion `compressString()`, die eine lange Zeichenfolge als Parameter erhält und die kürzere komprimierte Zeichenfolge zurückgibt.
 *
 * ### Parameter
 *
 * - `input` - Die gegebene lange Zeichenfolge.
 *
 * ### Rückgabewert/Ausgabe
 *
 * - Die kürzere komprimierte Zeichenfolge, in der aufeinanderfolgende gleiche Zeichen durch die Anzahl der Wiederholungen und das Zeichen selbst ersetzt wurden.
 *
 * ### Beispiel
 *
 * ```kotlin
 * val input = "aaaabbbcc"
 * val compressedString = compressString(input)
 *
 * println("Die komprimierte Zeichenfolge von '$input' ist: $compressedString.")
 * ```
 * In diesem Beispiel verwenden wir die Funktion compressString, um die Zeichenfolge "aaaabbbcc" zu komprimieren. Das erwartete Ergebnis ist die komprimierte Zeichenfolge "4a3b2c".
 *
 *
 * */


package com.example.compressedstring

fun main() {

    //hier kann getestet werden

    val input = "aaaabbbcc"
    val compressedString = compressString(input)

    println("Die komprimierte Zeichenfolge von '$input' ist: $compressedString.")

}

fun compressString(input: String): String {

    //TODO diese Funktion soll die Anzahl der Wiederholungen jedes Zeichens (die hintereinander stehen)
    // zählen und die Zeichenfolge entsprechend kürzen.
    if (input.isEmpty()) {
        return ""
    }

    val compressedString = StringBuilder()
    var count = 1
    for (i in 1 until input.length) {
        if (input[i] == input[i - 1]) {
            count++
        } else {
            compressedString.append(count).append(input[i - 1])
            count = 1
        }
    }

    compressedString.append(count).append(input[input.length - 1])

    return compressedString.toString()
}