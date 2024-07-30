fun main() {
    val theString = "hello Racecar babb as nenonen"
    val result = findLongestPalindromes(theString)
    print(result)
}

fun isPalindrome(stringValue: String): Boolean {
    return (stringValue == stringValue.reversed())
}

fun findLongestPalindromes(theString: String): MutableSet<String> {
    val stringValue = theString.lowercase().replace(" ", "")

    var palindromesSet = mutableSetOf<String>()
    var longestLength = 0

    for (i in 0 until stringValue.length) {
        for (j in (i + 1)..stringValue.length) {
            val substring = stringValue.substring(i, j)
            if (isPalindrome(substring)) {
                val substringLength = substring.length
                if (substringLength > longestLength) {
                    longestLength = substringLength
                    palindromesSet = mutableSetOf(substring)
                }
                else if (substringLength == longestLength) {
                    palindromesSet.add(substring)
                }
            }
        }
    }

    return palindromesSet
}