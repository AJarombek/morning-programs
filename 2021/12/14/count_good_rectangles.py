"""
https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/
Author: Andrew Jarombek
Date: 12/14/2021
"""

from typing import List

# I believe you can achieve anything you set your mind to.  Whatever you desire is within reach.


def count_good_rectangles(rectangles: List[List[int]]) -> int:
    largest = 0
    count = 0

    for rectangle in rectangles:
        size = min(rectangle)

        if size > largest:
            largest = size
            count = 1
        elif size == largest:
            count += 1

    return count
