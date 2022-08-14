"""
https://leetcode.com/problems/shuffle-the-array/
Author: Andrew Jarombek
Date: 8/14/2022
"""

from typing import List


def shuffle(nums: List[int], n: int) -> List[int]:
    result = []

    for i in range(n):
        result.append(nums[i])
        result.append(nums[i + n])

    return result


def shuffle_slower(nums: List[int], n: int) -> List[int]:
    result = [0] * len(nums)

    for i in range(n):
        result[i * 2] = nums[i]
        result[i * 2 + 1] = nums[i + n]

    return result


if __name__ == '__main__':
    assert shuffle([2, 5, 1, 3, 4, 7], 3) == [2, 3, 5, 4, 1, 7]
    assert shuffle_slower([2, 5, 1, 3, 4, 7], 3) == [2, 3, 5, 4, 1, 7]
