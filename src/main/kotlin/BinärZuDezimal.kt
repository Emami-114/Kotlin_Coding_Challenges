/**
 * ## Dezimalzahlen zu Binärzahlen umrechnen
 *
 * ```
 * In dieser Challenge soll eine Dezimalzahl in eine Binärzahl umgewandelt werden
 * ```
 * ```
 * Die Umwandlung der Dezimalzahl 41 funktioniert folgendermaßen:
 * ```
 * ![img.png](img.png)
 *
 * ```
 * Das Ergebnis lautet also (von unten nach oben!) `101001`
 * ```
 *
 * `TODO: Schreibe die Funktion convertToBinary(), die nach obigem Prinzip Zahlen in Binärzahlen umwandelt.
 * `
 *
 * ### Parameter
 * - `dezimalzahl` - Die Dezimalzahl, die in eine Binärzahl umgewandelt werden soll.
 *
 * ### Rückgabewert/Ausgabe
 * - Die Binärzahl als Ergebnis der Umwandlung.
 *
 * ### Beispiel
 * ```kotlin
 *
 * val dezimalzahl = 13
 * val binärzahl = convertToBinary(dezimalzahl) // Die Binärzahl "1101"
 *
 * println(binärzahl)
 * ```
 * ### Tipp:
 * - benutze den mod() Operator
 * */

fun main() {

    //hier kann getestet werden
    println(convertToBinary(41))
    println(convertToBinary(13))
    println("----- convert with toString")
    println(convertToBinaryWithToString(41))
    println(convertToBinaryWithToString(13))
    println("------ convert with toBinaryString")
    println(convertToBinaryWithToBinary(41))
    println(convertToBinaryWithToBinary(13))

}

fun convertToBinary(dezimalzahl: Int): String {
    var zahl = dezimalzahl
    var binarzahl = ""
    while (zahl > 0){
        val rest = zahl % 2
        binarzahl = rest.toString() + binarzahl
        zahl /= 2
    }
    return binarzahl

}

fun convertToBinaryWithToString(dezimalzahl: Int): String {
    return dezimalzahl.toString(2)

}fun convertToBinaryWithToBinary(dezimalzahl: Int): String {
    return Integer.toBinaryString(dezimalzahl)

}