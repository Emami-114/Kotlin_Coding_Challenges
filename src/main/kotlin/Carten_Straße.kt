/**Deine Aufgabe ist es, die Funktion `getStraight` zu implementieren. Sie erhält einen gemischten Kartenstapel aus 52 Karten als Parameter.
Die Funktion durchsucht den Stapel und findet die größte Straße, d.h. die meisten aufeinander folgenden, aufsteigenden Karten.
Diese Karten werden in einer Liste zurückgegeben. Eine Karte wird dabei immer durch einen String repräsentiert, z.B. `"A♦"`

> Hinweis:
> Wie du die Funktion schreibst ist dir überlassen, du kannst auch gerne Hilfsfunktionen verwenden.
> Jede Karte kommt immer nur einmal vor und **in der Regel** ist die größte Straße nur 2 bis 4 Karten groß

## Beispiel

```
Karten werden gemischt ♠ ♣ ♥ ♦
Stapel: [4♣, 8♣, 8♦, D♠, 5♣, 3♥, 2♣, 6♠, B♦, 4♠, 7♦, 6♥, 10♠, 4♥, 10♥, 9♦, 8♠, A♠, 5♥, K♥, 9♣, B♣, 8♥, 3♣, 7♠, 7♥, 3♦, 3♠, 4♦, 5♠, 2♥, 6♣, 10♦, 7♣, B♠, K♣, B♥, 9♥, 2♦, A♦, 10♣, D♥, 2♠, A♣, 5♦, K♠, A♥, K♦, D♦, 6♦, 9♠, D♣]
Suche größte Straße ♠ ♣ ♥ ♦
Die größte Straße ist: [3♠, 4♦, 5♠], mit 3 Karten*/



private val cardDeck2 = listOf(
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
    val shuffledCards = cardDeck2.shuffled()
    repeat(4) {
        print("${arrayOf("♠", "♣", "♥", "♦")[it]} ")
        Thread.sleep(300)
    }
    println("\nStapel: $shuffledCards")
    Thread.sleep(300)
    print("Suche größte Straße ")
    val straight = getStraight(shuffledCards)
    repeat(4) {
        print("${arrayOf("♠", "♣", "♥", "♦")[it]} ")
        Thread.sleep(300)
    }
    println("\nDie größte Straße ist: $straight, mit ${straight.size} Karten")
}

private fun getStraight(cards: List<String>): List<String> {
    val longest = mutableListOf<String>()
    val current = mutableListOf<String>()
    for (i in cards.indices) {
        if (i + 1 >= cards.size) break
        if (rankOf(cards[i + 1]) == rankOf(cards[i]) + 1) {
            if (!current.contains(cards[i])) {
                current.add(cards[i])
            }
            current.add(cards[i + 1])

            if (current.size > longest.size) {
                longest.clear()
                longest.addAll(current)
            }
        } else {
            current.clear()
        }
    }
    return longest
}

private fun rankOf(card: String): Int {
    return when {
        card.contains("A") -> 1
        card.contains("2") -> 2
        card.contains("3") -> 3
        card.contains("4") -> 4
        card.contains("5") -> 5
        card.contains("6") -> 6
        card.contains("7") -> 7
        card.contains("8") -> 8
        card.contains("9") -> 9
        card.contains("10") -> 10
        card.contains("B") -> 11
        card.contains("D") -> 12
        card.contains("K") -> 13
        else -> 0
    }
}


