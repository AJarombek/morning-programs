"""
https://leetcode.com/problems/maximum-subarray/
Author: Andrew Jarombek
Date: 7/20/2021
"""

# I miss you

from typing import List


def max_sub_array(nums: List[int]) -> int:
    max_sum = float('-inf')
    current_sum = 0

    for num in nums:
        current_sum = current_sum + num
        max_sum = max(max_sum, current_sum)

        if current_sum < 0:
            current_sum = 0

    return max_sum


if __name__ == '__main__':
    assert max_sub_array([-2, 1, -3, 4, -1, 2, 1, -5, 4]) == 6
