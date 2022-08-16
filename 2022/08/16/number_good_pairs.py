"""
https://leetcode.com/problems/number-of-good-pairs/
Author: Andrew Jarombek
Date: 8/16/2022
"""

from typing import List


def num_identical_pairs(nums: List[int]) -> int:
    items = {}
    result = 0

    for num in nums:
        val = items.get(num, 0)
        result += val
        items[num] = val + 1

    return result


if __name__ == '__main__':
    assert num_identical_pairs([1, 2, 3, 1, 1, 3]) == 4
    assert num_identical_pairs([1, 1, 1, 1]) == 6
    assert num_identical_pairs([1, 2, 3, 4]) == 0
