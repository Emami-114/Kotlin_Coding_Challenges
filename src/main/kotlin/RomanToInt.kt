



fun main(){
    println(romanToInt("XII"))
    println(RomanToInt("XII"))
}

/**For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.*/

fun RomanToInt(roman: String): Int {
    val values = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var result = 0
    var previousValue = 0

    for (i in roman.indices.reversed()) {
        val currentValue = values[roman[i]] ?: 0

        if (currentValue >= previousValue) {
            result += currentValue
        } else {
            result -= currentValue
        }

        previousValue = currentValue
    }

    return result
}



fun romanToInt(s: String): Int {
    val map = hashMapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
    var result = 0
    var i = 0
    while (i < s.length) {
        val current = map[s[i]] ?: 0
        val next = if (i < s.length - 1) map[s[i + 1]] ?: 0 else 0
        if (current < next) {
            result += next - current
            i += 2
        } else {
            result += current
            i += 1
        }
    }
    return result
}