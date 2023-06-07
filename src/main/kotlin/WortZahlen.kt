/**
 * Zähle die Anzahl der Wörter in einem gegebenen Satz!
 * ```
 *
 * ```
 * Manchmal ist es nützlich, die Anzahl der Wörter in einem Satz zu zählen. Zum Beispiel kann dies bei der Analyse von Texten oder bei der Überprüfung von Eingaben in einem Formular hilfreich sein.
 * Um die Anzahl der Wörter in einem Satz zu zählen, müssen wir das Leerzeichen als Trennzeichen verwenden. Ein Wort wird definiert als eine Gruppe von Zeichen, die durch Leerzeichen getrennt sind.
 * Es gibt verschiedene Ansätze, um dieses Problem zu lösen. Eine mögliche Vorgehensweise ist es, den Satz in Wörter aufzuteilen und dann die Anzahl der erhaltenen Wörter zu zählen.
 * Schreibe eine Funktion countWords(), die die Anzahl der Wörter in einem gegebenen Satz zählt.
 * ```
 *
 * ### Parameter
 *
 * - `sentence` - Der Satz, in dem die Wörter gezählt werden sollen.
 *
 * ### Rückgabewert/Ausgabe
 *
 * - Die Anzahl der Wörter im Satz.
 *
 * ### Beispiel
 * ```kotlin
 * val sentence = "Das ist ein Beispiel Satz"
 * val wordCount = countWords(sentence) // Anzahl der Wörter: 5
 *
 * println(wordCount)
 * ```
 *
 * Bitte beachte, dass Sonderzeichen und Satzzeichen keine separaten Wörter sind und daher nicht als separate Wörter gezählt werden sollten.
 *
 * Viel Spaß beim Lösen dieser Challenge!*/


fun main() {

    //hier kann getestet werden
    println(countWords("Das ist ein Beispiel Satz"))
    println(countWords2("Das ist ein Beispiel"))
}

fun countWords(s: String): Int {

    return s.split(" ").size

}


fun countWords2(sentence: String): Int {
    val countList = sentence.filter { it == ' ' }
    return countList.length + 1
}