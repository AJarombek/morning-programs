"""
https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
Author: Andrew Jarombek
Date: 9/1/2021
"""


from typing import List


def find_disappeared_numbers(nums: List[int]) -> List[int]:
    nums_set = set(nums)
    full_set = set(range(1, len(nums) + 1))

    return list(full_set - nums_set)


if __name__ == '__main__':
    assert find_disappeared_numbers([1, 1]) == [2]
