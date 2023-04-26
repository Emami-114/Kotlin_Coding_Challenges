val cardDeck = mutableListOf(
    "A♠", "A♣", "A♥", "A♦",
    "2♠", "2♣", "2♥", "2♦",
    "3♠", "3♣", "3♥", "3♦",
    "4♠", "4♣", "4♥", "4♦",
    "5♠", "5♣", "5♥", "5♦",
    "6♠", "6♣", "6♥", "6♦",
    "7♠", "7♣", "7♥", "7♦",
    "8♠", "8♣", "8♥", "8♦",
    "9♠", "9♣", "9♥", "9♦",
    "10♠", "10♣", "10♥", "10♦",
    "B♠", "B♣", "B♥", "B♦",
    "D♠", "D♣", "D♥", "D♦",
    "K♠", "K♣", "K♥", "K♦"
)

fun main() {
    print("Karten werden gemischt ")
    repeat(4) {
        print("${arrayOf("♠", "♣", "♥", "♦")[it]} ")
        Thread.sleep(300)
    }
    cardDeck.shuffle()
    println("\nStapel: $cardDeck")
    Thread.sleep(300)
    print("Karten werden sortiert ")
    repeat(4) {
        print("${arrayOf("♠", "♣", "♥", "♦")[it]} ")
        Thread.sleep(300)
    }
    sortCards()
    println("\nStapel: $cardDeck")
}

/**
 * Diese Funktion sortiert das Kartendeck folgerndermaßen:
 * Erst alle Pikkarten von A bis K
 * Dann alle Kreuzkarten von A bis K
 * Dann alle Herzkarten von A bis K
 * Dann alle Karokarten von A bis K
 */
private fun sortCards(){
    cardDeck.sortBy { it ->
        when (it.last()) {
            '♠' -> 1
            '♣' -> 2
            '♥' -> 3
            else -> 4
        } * 100 + when (it.first()) {
            'A' -> 1
            in '2'..'9' -> it.first().toString().toInt()
            'B' -> 11
            'D' -> 12
            else -> 13
        }
    }
}