"""
https://leetcode.com/problems/height-checker/
Author: Andrew Jarombek
Date: 10/30/2021
"""

from typing import List


def height_checker(heights: List[int]) -> int:
    sorted_heights = sorted(heights)
    return sum([1 if heights[i] != sorted_heights[i] else 0 for i in range(len(heights))])
