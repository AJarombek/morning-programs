"""
https://leetcode.com/problems/calculate-money-in-leetcode-bank/
Author: Andrew Jarombek
Date: 12/12/2021
"""


def total_money_faster(n: int) -> int:
    result = 0
    loop = 0

    while n > 7:
        result += 28 + 7 * loop
        n -= 7
        loop += 1

    for i in range(1, n + 1):
        result += i + loop

    return result


def total_money(n: int) -> int:
    result = 0
    prev = 6
    i = 0

    while i < n:
        if i % 7 == 0:
            prev -= 5
            result += prev
        else:
            prev += 1
            result += prev

        print(prev)
        i += 1

    return result
