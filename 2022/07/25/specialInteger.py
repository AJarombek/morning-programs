"""
https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
Author: Andrew Jarombek
Date: 7/25/2022
"""

from typing import List


def find_special_integer(arr: List[int]) -> int:
    threshold = len(arr) / 4
    count = 0
    prev = -1

    for x in arr:
        if x != prev:
            count = 0
            prev = x

        count += 1

        if count > threshold:
            return x

    return -1


if __name__ == '__main__':
    assert find_special_integer([1, 2, 2, 6, 6, 6, 6, 7, 10]) == 6
    assert find_special_integer([1, 1]) == 1
