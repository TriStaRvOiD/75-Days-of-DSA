import java.util.Arrays;
import java.util.List;

class Day6 {
    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(1020, 30, 70, 232, 54, 500, 4231, 43, 1, 20, 1, 1, 1, 1);
        List<Integer> result = findMaxProfit(prices);
        System.out.println("Profit: " + result.get(0) + " Buy day: " + result.get(1) + " Sell day: " + result.get(2));
    }

    public static List<Integer> findMaxProfit(List<Integer> prices) {

        int minDay = -1;
        int buyDay = -1;
        int sellDay = -1;

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.size(); i++) {
            int price = prices.get(i);
            if (price < minPrice) {
                minPrice = price;
                minDay = i;
            }
            int potentialProfit = price - minPrice;
            if (potentialProfit > maxProfit) {
                maxProfit = potentialProfit;
                buyDay = minDay;
                sellDay = i;
            }
        }
        return (Arrays.asList(maxProfit, buyDay + 1, sellDay + 1));
    }
}