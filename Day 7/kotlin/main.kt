fun main() {
    val line = "hello world.   how are  you?"
    val words = line.split("\\s+".toRegex())
    val reversedLine = words.reversed().joinToString(" ")
    println(reversedLine)
}