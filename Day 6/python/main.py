def max_profit(prices):
    # Initialize variables to track the minimum price, buy day, sell day, and maximum profit
    min_price = float('inf')
    min_day = -1
    max_profit = 0

    buy_day = -1
    sell_day = -1
    
    # Iterate through the list of prices
    for i, price in enumerate(prices):
        # Update the minimum price and buy day if the current price is lower
        if price < min_price:
            min_price = price
            min_day = i
        # Calculate the potential profit if the stock were sold at the current price
        potential_profit = price - min_price
        # Update the maximum profit and sell day if the potential profit is higher
        if potential_profit > max_profit:
            max_profit = potential_profit
            buy_day = min_day
            sell_day = i
            
    return max_profit, (buy_day + 1), (sell_day + 1)

prices = [1020, 30, 70, 232, 54, 500, 4231, 43, 1, 20, 1, 1, 1, 1]
profit, buy_day, sell_day = max_profit(prices)
print(f"Maximum profit: {profit}, Buy on day: {buy_day}, Sell on day: {sell_day}")