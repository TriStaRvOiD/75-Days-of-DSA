fun anagramCheck(first: String, second: String): Boolean {
    if (first.length != second.length) return false
    
    val firstDict = mutableMapOf<Char, Int>()
    val secondDict = mutableMapOf<Char, Int>()

    for (char in first) {
        firstDict[char] = firstDict.getOrDefault(char, 0) + 1
    }

    for (char in second) {
        secondDict[char] = secondDict.getOrDefault(char, 0) + 1
    }

    return firstDict == secondDict
}

fun main() {
    var s = "anagram"
    var t = "nagaram"
    var result = anagramCheck(s, t)
    if (result) {
        println("yes")
    } else {
        println("no")
    }

    s = "anagra"
    t = "nagaram"
    result = anagramCheck(s, t)
    if (result) {
        println("yes")
    } else {
        println("no")
    }
}