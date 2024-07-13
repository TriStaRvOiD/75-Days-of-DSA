import java.util.Scanner

fun main() {
    val nums = mutableListOf<Int>()

    val reader = Scanner(System.`in`)

    print("\nEnter the number of elements the array will have: ")

    val count = reader.nextInt()

    for (i in 1..count) {
        print("\nEnter integer $i: ")
        val num = reader.nextInt()
        nums.add(num)
    }

    val ans = nums + nums
    println(ans)
}
