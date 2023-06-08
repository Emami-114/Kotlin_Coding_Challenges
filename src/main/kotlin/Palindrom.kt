/**
 * Schreibe eine Funktion, die überprüft, ob ein gegebenes Wort oder Satz ein Palindrom ist.
 * Ein Palindrom ist ein Wort oder Satz, der vorwärts und rückwärts gelesen identisch ist.
 * Achte auch auf Groß- und Kleinschreibung!
 *
 * ## Rückgabewert
 *
 * Die Funktion soll ein ```true```zurückliefern, wenn das Wort ein Palindrom ist, ```false``` wenn nicht.
 *
 * ## Beispiel
 *
 * ```kotlin
 * val word1 = isPalindrome("anna")
 * println(word1) // true
 * val word2 = isPalindrome("autobahn")
 * println(word1) // false
 * ```
 * */

fun main() {
    println(isPalindrome("anna"))    // true
    println(isPalindrome("autobahn"))           // false
    println(isPalindrome("Radar"))   // false
}

fun isPalindrome(str: String): Boolean {
    val strLowerCase: String = str
    val strReverse = strLowerCase.reversed()

    return strLowerCase == strReverse
}