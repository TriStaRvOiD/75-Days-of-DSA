import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter number of rows: ")
    val rowCount = scanner.nextInt()

    printPascalTriangle(generatePascalTriangle(rowCount))
}

fun generatePascalTriangle(rowCount: Int): List<List<Int>> {
    val triangle = mutableListOf<List<Int>>()
    for (rowNum in 0 until rowCount) {
        val row = MutableList(rowNum + 1) { 1 }
        for (i in 1 until rowNum) {
            row[i] = triangle[rowNum - 1][i - 1] + triangle[rowNum - 1][i]
        }
        triangle.add(row)
    }
    return triangle
}

fun printPascalTriangle(triangle: List<List<Int>>) {
    val numRows = triangle.size
    for (i in triangle.indices) {
        val row = triangle[i]
        val numSpaces = numRows - i - 1
        print(" ".repeat(numSpaces * 2))
        println(row.joinToString("   "))
    }
}