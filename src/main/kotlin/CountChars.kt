/**Deine Aufgabe ist es die Funktion countChars() auszufüllen.
Die Funktion bekommt einen Text und gibt eine Map vom Typ <String, Int> zurück.

Die Funktion soll alle verschiedene Buchstaben im Text als Keys eintragen.
Und die Buchstaben bilden dann auf einen Int ab, der angibt, wie häufig der Buchstabe
im Text vorgekommen ist.

Satzzeichen sowie Leerzeichen sollen <b>nicht</b> gezählt werden.

Buchstaben sind <b>nicht case-sensitive</b>, d.h. es wird nicht zwischen großen
und kleinen Buchstaben unterschieden.

## Beispiel

> Input:
> "Das ist dein Text."
>
> Output:
> {d=2, a=1, s=2, i=2, t=3, e=2, n=1, x=1}

Wenn du mit deiner Lösung fertig bist, kannst du die Zeile `//testTask()` in der Main-Funktion
einkommentieren. Wenn deine Lösung korrekt ist, wird in der Konsole "Ok." ausgegeben, wenn du das
Programm laufen lässt.
 */


fun main() {
    // Kommentiere die folgende Zeile ein, um deine Lösung zu testen.
    println(testTask())
    println(countChars("Das ist dein Text."))
}

fun countChars(text: String): MutableMap<Char, Int> {
    var mutablemap = mutableMapOf<Char, Int>()
    for (char in text) {
        if (!char.isLetter()) {
            continue
        }
        val charLowerCase = char.toLowerCase()
        mutablemap[charLowerCase] = mutablemap.getOrDefault(charLowerCase, 0) + 1

    }

    return mutablemap
}


// TODO: Test Funktion
fun testTask(): String {
    return if (testOne() && testTwo() && testThree())
        "Ok."
    else
        "Tests failed."
}

private fun testOne(): Boolean {
    val expected = createMapFromString("{d=2, a=1, s=2, i=2, t=3, e=2, n=1, x=1}")
    val actual = countChars("Das ist dein Text.")
    return expected == actual
}

private fun testTwo(): Boolean {
    val expected = createMapFromString("{d=15, i=29, e=54, s=20, o=4, n=33, c=11, h=20, " +
            "l=9, a=13, m=13, u=15, v=2, g=6, z=4, w=6, t=18, r=19, f=5, b=3, k=3, p=1}")
    val actual = countChars("Die Sonne schien hell am Himmel und die Vögel zwitscherten fröhlich im Baum. " +
            "Ein leichter Wind strich sanft durch die Wiese und bewegte die Grashalme im Takt. " +
            "In der Ferne konnte man das Rauschen eines Flusses hören. " +
            "Es war ein wunderschöner Tag und die Natur zeigte sich von ihrer besten Seite. " +
            "Ein perfekter Moment, um innezuhalten und die Schönheit um sich herum zu genießen.")
    return expected == actual
}

private fun testThree(): Boolean {
    val expected = mutableMapOf<Char, Int>()
    val actual = countChars("!?. ()\"")
    return expected == actual
}

private fun createMapFromString(stringMap: String): MutableMap<Char, Int> {
    val map = mutableMapOf<Char, Int>()
    val keyValuePairs = stringMap.substring(1, stringMap.length - 1).split(", ")
    for (pair in keyValuePairs) {
        val keyValuePair = pair.split("=")
        val key = keyValuePair[0].trim().first()
        val value = keyValuePair[1].trim().toInt()
        map[key] = value
    }
    return map
}