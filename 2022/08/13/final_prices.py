"""
https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
Author: Andrew Jarombek
Date: 8/13/2022
"""

from typing import List


def final_prices(prices: List[int]) -> List[int]:
    result = []

    for index, price in enumerate(prices[:-1]):
        i = index + 1

        while i < len(prices) - 1 and prices[i] > price:
            i += 1

        if price >= prices[i]:
            val = price - prices[i]
        else:
            val = price

        result.append(val)

    result.append(prices[-1])

    return result


if __name__ == '__main__':
    assert final_prices([8, 4, 6, 2, 3]) == [4, 2, 4, 2, 3]
    assert final_prices([1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]
