fun main() {
    println(anagram("Fahne", "Hafen"))   //true
    println(anagram("Lachs", "Flachs")) //false
}

/**
Schreibe eine Funktion die überprüft ob 2 Strings Anagramme sind.
2 Strings sind Anagramme wenn sie aus den selben Buchstaben bestehen
(Groß- und Kleinschreibung wird hierbei ignoriert)
 */
fun anagram(s1: String, s2: String): Boolean {

    val sort1 = s1.lowercase().toCharArray()
    val sort2 = s2.lowercase().toCharArray()

    sort1.sort()
    sort2.sort()

    for (i in sort1.indices) {
        if (sort1[i] != sort2[i]) {
            return false
        }
    }
    return true

}