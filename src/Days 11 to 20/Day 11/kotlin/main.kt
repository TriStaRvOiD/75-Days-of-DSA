fun main() {
    val a = "abcd"
    val b = "cdabcdab"
    println(findMinRepeats(a, b))
}

fun findMinRepeats(a: String, b: String): Int {
    val lenA = a.length
    val lenB = b.length
    val repeatCount = (lenB + lenA - 1) / lenA

    var repeatedA = a.repeat(repeatCount)

    if (b in repeatedA) {
        return repeatCount
    }

    repeatedA += a

    if (b in repeatedA) {
        return repeatCount + 1
    }

    return -1
}