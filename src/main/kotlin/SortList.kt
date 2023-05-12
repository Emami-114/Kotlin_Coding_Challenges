/**Deine Aufgabe ist es, eine Liste an ganzen Zahlen (Int's) aufsteigend zu
sortieren.

Ein Beispiel:

unsortiert: [4, 2, 3, 1]
sortiert: [1, 2, 3, 4]

Damit du aber nicht eine Sortier-Funktion der Listenklasse benutzt, gibt es hier noch
eine kleine Einschränkung:
Die Liste ist in einer weiteren Klasse "MyList" versteckt und du kannst die Liste
nur über diese Klasse erreichen. Die Klasse bietet dir auch nur ein paar Methoden, nämlich:
1. size() - Gibt die Anzahl der Zahlen in der Liste wieder.
2. get(i: Int): Int - Gibt die Zahl an der Stelle i aus der Liste wieder.
3. swap(i: Int, j: Int) - Tauscht die Zahl an der Stelle i mit der Zahl an der Stelle j.
4. isSortedAscending(): Boolean - Gibt `true` zurück, wenn die Liste aufsteigend sortiert ist, ansonsten `false`.

In der Main.kt sind bereits ein paar Listen zum Testen erstellt.
Fülle für diese Aufgabe die Funktion `sort()` aus. Führe dann die Main.kt aus.
In der Konsole wird dir Feedback gegeben.*/



// Sorted =  [1, 2, 3, 4]
val myList1 = MyList(listOf(4, 3, 2, 1))

// Sorted =  [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
val myList2 = MyList(listOf(8, 3, 5, 2, 0, 4, 7, 9, 1, 6))

// Sorted = [1, 2, 3, 4, 5, 6, 7, 8, 9, 16, 35, 37, 41, 42, 45, 46, 47, 51, 53, 58, 73, 78, 84, 234, 426, 845, 4891, 7473]
val myList3 = MyList(listOf(46, 3, 7473, 426, 47, 35, 37, 8, 7, 9, 234, 1, 53, 845, 84, 6, 2, 51, 5, 4, 73, 4891, 41, 45, 16, 42, 78, 58))

// Sorted = [0, 1, 2, ... 97, 98, 99]
val myList4 = MyList((0..99).shuffled())

fun main() {
    println("List nr 1: ${sort(myList1)}")
    println("Is List nr 1 correctly sorted? ${myList1.isSortedAscending()}")
    println("List nr 2: ${sort(myList2)}")
    println("Is List nr 2 correctly sorted? ${myList2.isSortedAscending()}")
    println("List nr 3: ${sort(myList3)}")
    println("Is List nr 3 correctly sorted? ${myList3.isSortedAscending()}")
    println("List nr 4: ${sort(myList4)}")
    println("Is List nr 4 correctly sorted? ${myList4.isSortedAscending()}")
}

fun sort(list: MyList): MyList {
    var swapped = true
    while (swapped) {
        swapped = false
        for (i in 0 until list.size() - 1) {
            if (list.get(i) > list.get(i + 1)) {
                list.swap(i, i + 1)
                swapped = true
            }
        }
    }
    return list
}









/**
 * MyList acts as a MutableList with much reduced functionality.
 */
class MyList(private val arg: List<Int>) {

    // Copy arg list content
    private val numbers = MutableList(arg.size){ arg[it] }

    /**
     * Returns size of list
     */
    fun size() = numbers.size

    /**
     * Returns element at index i of list
     */
    fun get(i: Int): Int {
        if (i < 0 || i > size() - 1)
            throw IllegalArgumentException("i is out of bounds.")
        return numbers[i]
    }

    /**
     * Swaps element at index i with element at index j of list
     */
    fun swap(i: Int, j: Int): Boolean {
        if (i < 0 || i > size() - 1)
            throw IllegalArgumentException("i is out of bounds.")
        if (j < 0 || j > size() - 1)
            throw IllegalArgumentException("j is out of bounds.")
        val tmp = numbers[i]
        numbers[i] = numbers[j]
        numbers[j] = tmp
        return true
    }

    fun isSortedAscending(): Boolean {
        return numbers == numbers.sorted()
    }

    override fun toString(): String {
        return numbers.toString()
    }
}