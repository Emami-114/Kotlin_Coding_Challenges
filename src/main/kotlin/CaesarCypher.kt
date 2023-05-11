/**```
Hilf Julius Caesar dabei mit seinen Offizieren zu kommunizieren!
```

```
In der Kryptography ist eine Caesar Cipher eine Art Austausch, wo der ASCII-Wert eines Buchstabens
im Eingabetext eine bestimmte Anzahl an Stellen nach vorne im Alphabet gesetzt wird und somit
verschlüsselt wieder ausgegeben wird.
Um wieder zu entschlüsseln, muss das Ganze rückwärts gemacht werden.

Hinweise:

Hier wird der Datentyp `char`(einzelne Buchstaben) gebraucht (Bsp.: var c = 'C')

ASCII-Werte können nicht nur Großbuchstaben repräsentieren, sondern auch andere Zeichen,
die nichts mit dem Alphabet zu tun haben. Dadurch ist der Wertebereich viel größer als bei
einem Alphabet mit nur 26 Buchstaben.
Bleibe deshalb zur Vereinfachung nur bei Großbuchstaben in der message
Achte darauf, dass dein verschlüsselter Buchstabe weiterhin ein Buchstabe bleibt und nicht ein
Sonderzeichen wird. Wenn du z.B. den Buchstaben Z um zwei Stellen weiter verschiebst
und damit über das Ende des Alphabets kommst, fängst du wieder am Anfang an.
D.h. Z -> A -> B.
(So wie bei der Uhr, 23 Uhr plus 2 Stunden ist nicht 25 Uhr, sondern wieder 1 Uhr).

Den ASCII-Wert eines char's bekommt man durch .toInt(),
.toChar() gibt den Buchstaben der zu der zugehörigen Zahl wieder zurück.
```

Schreibe eine Funktion `encrypt()`, die jeden Buchstaben in einem Text um x Stellen verschiebt. (verschlüsselt)

Schreibe eine zweite Funktion `decrypt()`, die jeden Buchstaben in einem Text um x Stellen zurückverschiebt. (entschlüsselt)

### Parameter

- `message` und `shifted` - Der unverschlüsselte Text und die Anzahl der Stellen,
die verschoben werden sollen.

### Rückgabewert/Ausgabe

- Der verschlüsselte Text, der entschlüsselte Text.

### Beispiel

```kotlin
val message = "GEHEIM"
val shifted = 3

message = encrypt(message, shifted) // Verschlüsselte message "JHKHLP"
println(message)

println(decrypt(message, shifted)) // Entschlüsselte message "GEHEIM"
```*/



fun main(){
    val message = "GEHEIM"
    val shifted = 3

    val encryptedMessage = encrypt(message, shifted)
    println(encryptedMessage) // Ausgabe: JHKHLP

    val decryptedMessage = decrypt(encryptedMessage, shifted)
    println(decryptedMessage) // Ausgabe: GEHEIM

}

fun encrypt(message: String, shifted: Int): String {
    var encrypted = ""
    for (c in message) {
        if (c !in 'A'..'Z') {
            // Wenn der Charakter nicht im Bereich 'A'..'Z' ist, füge ihn unverschlüsselt hinzu
            encrypted += c
        } else {
            // Andernfalls verschiebe den Charakter um die angegebene Anzahl von Stellen und füge ihn hinzu
            val shiftedChar = ((c.code - 'A'.code + shifted) % 26 + 'A'.code).toChar()
            encrypted += shiftedChar
        }
    }
    return encrypted
}

fun decrypt(message: String, shifted: Int): String {
    // Die Entschlüsselung erfolgt durch eine Verschiebung um die negierte Anzahl von Stellen
    return encrypt(message, -shifted)
}
