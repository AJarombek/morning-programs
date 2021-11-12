"""
https://leetcode.com/problems/check-if-it-is-a-straight-line/
Author: Andrew Jarombek
Date: 11/11/2021
"""

from typing import List


def check_straight_line(coordinates: List[List[int]]) -> bool:
    for i in range(2, len(coordinates)):
        numerator1 = coordinates[i][1] - coordinates[i - 1][1]
        denominator1 = coordinates[i][0] - coordinates[i - 1][0]

        numerator2 = coordinates[i - 1][1] - coordinates[i - 2][1]
        denominator2 = coordinates[i - 1][0] - coordinates[i - 2][0]

        if (numerator1 * denominator2) != (denominator1 * numerator2):
            return False

    return True
