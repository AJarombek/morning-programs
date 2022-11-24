"""
https://leetcode.com/problems/jump-game
Author: Andrew Jarombek
Date: 11/24/2022
"""

from typing import List


def can_jump(nums: List[int]) -> bool:
    maximum = 0

    for i in range(len(nums)):
        val = nums[i]

        if maximum == i and i < len(nums) - 1 and val == 0:
            return False

        maximum = max(maximum, i + val)

    return True


def can_jump_v1(self, nums: List[int]) -> bool:
    if len(nums) == 1:
        return True

    val = nums[0]

    if val == 0:
        return False

    if val >= len(nums):
        return True

    for i in range(1, min(len(nums), val) + 1):
        if self.canJump(nums[i:]):
            return True

    return False


if __name__ == '__main__':
    assert can_jump([0])
    assert not can_jump([3, 2, 1, 0, 4])
    assert can_jump([2, 3, 1, 1, 4])
