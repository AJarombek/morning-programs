"""
https://leetcode.com/problems/check-if-n-and-its-double-exist/
Author: Andrew Jarombek
Date: 8/7/2022
"""

from typing import List


def check_if_exist(arr: List[int]) -> bool:
    potential_results = set()
    zeroes = 0

    for item in arr:
        potential_results.add(item * 2)

        if item == 0:
            zeroes += 1

    for item in arr:
        if item in potential_results and item != 0 or zeroes > 1:
            return True

    return False


if __name__ == '__main__':
    assert check_if_exist([7, 1, 14, 11])
    assert not check_if_exist([3, 1, 14, 11])
