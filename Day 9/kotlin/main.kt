fun main() {
    var strings = listOf("flower", "flow", "flight")
    println(findLongestCommonPrefix(strings))
    
    strings = listOf("rad", "racecar", "car")
    println(findLongestCommonPrefix(strings))
}

fun findLongestCommonPrefix(listOfStrings: List<String>): String {
    if (listOfStrings.isEmpty()) return ""

    val shortestString = listOfStrings.minByOrNull { it.length } ?: return ""

    for (i in 0 until shortestString.length) {
        val char = shortestString[i]
        for (otherString in listOfStrings) {
            if (otherString[i] != char) {
                return shortestString.substring(0, i)
            }
        }
    }
    return shortestString
}