"""
https://leetcode.com/problems/intersection-of-two-arrays-ii/
Author: Andrew Jarombek
Date: 5/17/2022
"""

from typing import List


def intersect(nums1: List[int], nums2: List[int]) -> List[int]:
    elements = {}

    for num in nums1:
        elements[num] = elements.get(num, 0) + 1

    result = []
    for num in nums2:
        val = elements.get(num, 0)

        if val > 0:
            result.append(num)
            elements[num] = val - 1

    return result
