import java.util.Scanner

fun shuffleList(theList: List<Int>): List<Int> {
    val n = theList.size / 2
    val ans = mutableListOf<Int>()
    for (i in 0..n - 1) {
        ans.add(theList[i])
        ans.add(theList[i + n])
    }
    return ans
}

fun main() {
    val nums = mutableListOf<Int>()

    val reader = Scanner(System.`in`)

    var count = 0;

    while (true) {
        println("Enter number of elements the array will have. It must be at least 4, and an even number.")
        count = reader.nextInt()
        if (count >= 4 && count % 2 == 0)
            break
        else
            println("Invalid.")
    }

    for (i in 1..count) {
        print("\nEnter integer $i: ")
        val num = reader.nextInt()
        nums.add(num)
    }

    println(shuffleList(nums))
}