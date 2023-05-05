/**### Aufgabe:

``Ein Kind spielt mit einem Ball in einem Stockwerk eines Hochhauses. Die Höhe h dieses Stockwerks über dem Boden ist bekannt.

Es lässt den Ball aus dem Fenster fallen. Der Ball prallt zum Beispiel jedes Mal auf zwei Drittel seiner Höhe zurück (`bounce` 0,66).

Seine Mutter schaut aus einem Fenster, das 1,5 Meter (window) über dem Boden liegt.

Wie oft wird die Mutter den Ball vor ihrem Fenster vorbeifliegen sehen
 **(einschließlich wenn er fällt und zurückprallt)**?

Für ein gültiges Experiment müssen drei Bedingungen erfüllt sein:

- Der Double `h` in Metern muss größer als 0 sein.

- Der Double `bounce` muss größer als 0 und kleiner als 1 sein.

- Der Double `window` muss kleiner als h sein.

Wenn alle drei Bedingungen erfüllt sind, wird eine positive ganze Zahl (Int) zurückgegeben, andernfalls wird -1 zurückgegeben.

### Anmerkung:

Der Ball kann nur gesehen werden, wenn die Höhe des abprallenden Balls größer ist als der Parameter "window".

### Beispiele:

- `h` = 3, `bounce` = 0.66, `window` = 1.5, Ergebnis ist 3

- `h` = 30, `bounce` = 0.66 `window` = 1,5 Ergebnis ist 15

- `h` = 3, `bounce` = 1, `window` = 1,5, Ergebnis ist -1
``
 */

fun main() {

    //Test's
    println(bouncingBall(3.0, 0.66,1.5,))
    //Ergebnis sollte 3 sein

    println(bouncingBall(30.0, 0.66,1.5,))
    //Ergebnis sollte 15 sein

    println(bouncingBall(3.0, 1.0,1.5,))
    //Ergebnis sollte -1 sein
}


fun bouncingBall(h: Double, bounce: Double, window: Double): Int {
    if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
        return -1
    }
    var count = 1
    var height = h * bounce
    while (height > window) {
        count += 2
        height *= bounce
    }
    return count
}