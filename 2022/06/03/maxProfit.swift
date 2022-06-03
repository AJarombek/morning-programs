// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Author: Andrew Jarombek
// Date: 6/3/2022

func maxProfit(_ prices: [Int]) -> Int {
    var result = 0
    var minimum = prices[0]
    var maximum = prices[0]

    for price in prices.suffix(from: 1) {
        if (price > maximum) {
            maximum = price
            result = max(result, maximum - minimum)
        } else if (price < minimum) {
            maximum = price
            minimum = price
        }
    }

    return result
}