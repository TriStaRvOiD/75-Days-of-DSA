fun main() {
    val nums = listOf(1, 3, 3, 232, 54, 2, 4231, 43, 95)

    var maxCurrent = nums[0]
    var maxGlobal = nums[0]

    for (i in 1 until nums.size) {
        maxCurrent = maxOf(nums[i], maxCurrent + nums[i])
        if (maxCurrent > maxGlobal)
            maxGlobal = maxCurrent
    }

    println(maxGlobal)
}