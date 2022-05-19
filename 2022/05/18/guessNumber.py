"""
https://leetcode.com/problems/guess-number-higher-or-lower/
Author: Andrew Jarombek
Date: 5/18/2022
"""


def guess(n: int) -> int:
    pass


def guess_number(n: int) -> int:
    low = 1
    high = n

    while low <= high:
        mid = (low + high) // 2
        print(mid)
        result = guess(mid)

        if result == 0:
            return mid
        elif result == -1:
            high = mid - 1
        else:
            low = mid + 1

    return low
