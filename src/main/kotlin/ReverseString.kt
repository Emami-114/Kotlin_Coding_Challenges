/**
 * Schreibe eine Funktion, die als Parameter einen String übergeben bekommt und diesen umgekehrt zrückliefert.
 *
 *
 * ## Beispiel
 *
 * ```kotlin
 * val reversed = reverseString("Hello World.")
 * println(reversed) // .dlroW olleH
 * ```*/


fun main(){
    println(reverseString("I Love Code"))  // edoC evoL I
    println(reverseString("Hello World.")) // .dlroW olleH

}

fun reverseString(str: String): String{
    var reversed = ""
    val strToChar = str.lowercase().toCharArray()
    for (i in strToChar.size -1 downTo 0){
        reversed += strToChar[i]
    }



    return reversed
}