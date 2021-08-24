"""
Problem: https://leetcode.com/problems/intersection-of-two-arrays/
Author: Andrew Jarombek
Date: 8/24/2021
"""

from typing import List


def intersection(nums1: List[int], nums2: List[int]) -> List[int]:
    return list(set(nums1) & set(nums2))


if __name__ == '__main__':
    assert intersection([1, 2, 2, 1], [2, 2]) == [2]
