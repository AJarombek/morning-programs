"""
https://leetcode.com/problems/detect-pattern-of-length-m-repeated-k-or-more-times/
Author: Andrew Jarombek
Date: 8/19/2022
"""

from typing import List


def sum_odd_length_subarrays(arr: List[int]) -> int:
    total = sum(arr)
    length = 3

    while length <= len(arr):
        index = 0

        while index <= len(arr) - length:
            total += sum(arr[index:index + length])
            index += 1

        length += 2

    return total


if __name__ == '__main__':
    assert sum_odd_length_subarrays([1, 4, 2, 5, 3]) == 58
    assert sum_odd_length_subarrays([1, 2]) == 3
    assert sum_odd_length_subarrays([10, 11, 12]) == 66
