/**
 * # Benutzernamen Prüfen
 *
 *
 * Schreibe eine Funktion, die als Parameter einen Benutzernamen übergeben bekommt und diesen auf folgende Kriterien prüft:
 * 1. Der Name ist zwischen 4 und 25 Zeichen
 * 2. Er muss mit einem Buchstaben beginnen
 * 3. Er darf ausschließlich Buchstaben, Zahlen und Unterstrich(_) haben
 * 4. Er darf nicht auf einen Unterstrich(_) enden
 *
 * ## Rückgabewert
 *
 * Bei korrekter Eingabe soll ein ```true``` zurück geliefert werden, andernfalls ein ```false```.
 *
 * ## Beispiel
 *
 * ```kotlin
 * val user = usernameValidation("xXXep1cGamerHD__12")
 * println(user) // true
 * ```
 * */


fun main(){
    println(usernameValidation("aa_") )              // false
    println(usernameValidation("u__hello_world123")) // true
}

fun usernameValidation(name: String): Boolean{
    if (name.length < 4 || name.length > 25){
        return false
    }
    if (!name[0].isLetter()){
        return false
    }
    if (name.any{!it.isLetterOrDigit() && it != '_'}){
        return false
    }

    if (name[name.length - 1] == '_'){
        return false
    }


    return true
}