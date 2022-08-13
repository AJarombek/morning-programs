"""
https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/
Author: Andrew Jarombek
Date: 8/12/2022
"""

from typing import List


def k_length_apart(nums: List[int], k: int) -> bool:
    distance = 0
    index = 0

    while index < len(nums) and nums[index] == 0:
        index += 1

    index += 1

    while index < len(nums):
        if nums[index] == 0:
            distance += 1
        else:
            if distance < k:
                return False

            distance = 0

        index += 1

    return True


if __name__ == '__main__':
    assert k_length_apart([1, 0, 0, 0, 1, 0, 0, 1], 2)
    assert not k_length_apart([1, 0, 0, 1, 0, 1], 2)
