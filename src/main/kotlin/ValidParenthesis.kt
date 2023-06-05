/**
 *
 * Überprüfe in dieser Challenge, ob die Klammern in einem String korrekt geöffnet und wieder geschlossen werden.<br>
 * Wenn eine Klammer geöffnet wird, muss diese auch wieder geschlossen werden!<br>
 * Folgende Klammern können vorkommen: (), [], {}
 *
 * ## Tipp
 * Achte darauf das eine Klammer nur geschlossen werden darf, wenn die offene Klammer davor vom Selben Typ ist.<br>
 * ```("([)]")```, wäre falsch, da die 3. Klammer eine runde Klammer ist und die letzte offene Klammer davor eine eckige.<br>
 * ```("{[]}")```, wäre jedoch richtig, da hier die 3. Klammer eine eckige ist, und die letze offene Klammer davor auch.
 *
 * ## Rückgabewert
 *
 * Die Funktion soll ein ```true```zurückliefern, wenn alle Klammern richtig geschlossen wurden, ```false``` wenn nicht.
 *
 * ## Beispiel
 *
 * ```kotlin
 * val s1 = isValidParenthesis("()[]{}")
 * println(s1) // true
 * val s2 = isValidParenthesis("([)]")
 * println(s2) // false
 * val s3 = isValidParenthesis("{[]}")
 * println(s3) // true
 * ```
 * */


fun main(){
    println(isValidParenthesis("()[]{}"))   //true
    println(isValidParenthesis("([)]"))     //false
    println(isValidParenthesis("{[]}"))     //true


    println(isValidParenthesis2("()[]{}"))   //true
    println(isValidParenthesis2("([)]"))     //false
    println(isValidParenthesis2("{[]}"))     //true
}

fun isValidParenthesis2(s: String): Boolean {
    val stack = mutableListOf<Char>()

    for (c in s) {
        when (c) {
            '(', '[', '{' -> stack.add(c)
            ')', ']', '}' -> {
                if (stack.isEmpty() || !isMatchingBracket(stack.removeLast(), c)) {
                    return false
                }
            }
        }
    }

    return stack.isEmpty()
}

fun isMatchingBracket(opening: Char, closing: Char): Boolean {
    return when {
        opening == '(' && closing == ')' -> true
        opening == '[' && closing == ']' -> true
        opening == '{' && closing == '}' -> true
        else -> false
    }
}


fun isValidParenthesis(s: String): Boolean {
    val stack = mutableListOf<Char>()
    val openingBrackets = listOf('(', '[', '{')
    val closingBrackets = listOf(')', ']', '}')

    for (c in s) {
        if (c in openingBrackets) {
            stack.add(c)
        } else if (c in closingBrackets) {
            if (stack.isEmpty()) {
                return false
            }

            val lastOpened = stack.removeAt(stack.size - 1)

            val openingIndex = openingBrackets.indexOf(lastOpened)
            val closingIndex = closingBrackets.indexOf(c)

            if (openingIndex != closingIndex) {
                return false
            }
        }
    }

    return stack.isEmpty()
}