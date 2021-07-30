"""
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
Author: Andrew Jarombek
Date: 7/30/2021
"""

from typing import List


def max_profit(prices: List[int]) -> int:
    lowest = prices[0]
    highest = lowest
    lowest_after_highest = lowest

    for price in prices[1:]:
        if price < lowest and price < lowest_after_highest:
            lowest_after_highest = price
        elif price >= highest:
            if lowest > lowest_after_highest:
                lowest = lowest_after_highest
                lowest_after_highest = price

            highest = price
        elif price - lowest_after_highest > highest - lowest:
            lowest = lowest_after_highest
            highest = price
            lowest_after_highest = price

    return highest - lowest


if __name__ == '__main__':
    assert max_profit([7, 1, 5, 3, 6, 4]) == 5
