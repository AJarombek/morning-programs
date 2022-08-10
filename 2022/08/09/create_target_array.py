"""
https://leetcode.com/problems/create-target-array-in-the-given-order/
Author: Andrew Jarombek
Date: 8/9/2022
"""

from typing import List


def create_target_array(nums: List[int], index: List[int]) -> List[int]:
    target = []

    for i in range(len(nums)):
        target.insert(index[i], nums[i])

    return target


if __name__ == '__main__':
    result = create_target_array([0, 1, 2, 3, 4], [0, 1, 2, 2, 1]) == [0, 4, 1, 3, 2]
