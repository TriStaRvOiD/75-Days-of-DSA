import java.util.Scanner

fun main() {
    val nums = mutableListOf<Int>()

    val reader = Scanner(System.`in`)

    var count = 0;

    while (true) {
        println("Enter length of array. It cannot be less than 2.")
        count = reader.nextInt()
        if (count >= 2)
            break
        else
            println("Invalid.")
    }

    for (i in 1..count) {
        print("\nEnter integer $i: ")
        val num = reader.nextInt()
        nums.add(num)
    }

    var goodPairCount = 0

    for (i in 0 until count) {
        for (j in (i + 1) until count) {
            if (nums[i] == nums[j])
                goodPairCount++
        }
    }

    println(goodPairCount)
}