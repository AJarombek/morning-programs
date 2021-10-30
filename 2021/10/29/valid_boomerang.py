"""
https://leetcode.com/problems/valid-boomerang/
Author: Andrew Jarombek
Date: 10/29/2021
"""

from typing import List


def is_boomerang(points: List[List[int]]) -> bool:
    if points[0] == points[1] or points[1] == points[2] or points[0] == points[2]:
        return False

    x1 = points[0][0] - points[1][0]
    grade1 = (points[0][1] - points[1][1]) / x1 if x1 != 0 else 0

    x2 = points[1][0] - points[2][0]
    grade2 = (points[1][1] - points[2][1]) / x2 if x2 != 0 else 0

    x3 = points[0][0] - points[2][0]
    grade3 = (points[0][1] - points[2][1]) / x3 if x3 != 0 else 0

    return grade1 != grade2 or grade1 != grade3


# Cross multiply to avoid divide by zero issues
def is_boomerang_cross_multiply(points: List[List[int]]) -> bool:
    if points[0] == points[1] or points[1] == points[2] or points[0] == points[2]:
        return False

    slope1 = (points[0][1] - points[1][1]) * (points[1][0] - points[2][0])
    slope2 = (points[1][1] - points[2][1]) * (points[0][0] - points[1][0])

    return slope1 != slope2
