fun main() {
    val prices = listOf(1020, 30, 70, 232, 54, 500, 4231, 43, 1, 20, 1, 1, 1, 1)
    val (maxProfit, buyDay, sellDay) = maxProfit(prices)
    println("Max Profit: $maxProfit, Buy Day: $buyDay, Sell Day: $sellDay")
}

fun maxProfit(prices: List<Int>): Triple<Int, Int, Int> {
    var minPrice = Int.MAX_VALUE
    var minDay = -1
    var maxProfit = 0

    var buyDay = -1
    var sellDay = -1

    prices.forEachIndexed { i, price ->
        if (price < minPrice) {
            minPrice = price
            minDay = i
        }
        val potentialProfit = price - minPrice
        if (potentialProfit > maxProfit) {
            maxProfit = potentialProfit
            buyDay = minDay
            sellDay = i
        }
    }
    return (Triple(maxProfit, buyDay + 1, sellDay + 1))
}