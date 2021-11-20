"""
https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
Author: Andrew Jarombek
Date: 11/19/2021
"""

from typing import List


def find_the_distance_value(arr1: List[int], arr2: List[int], d: int) -> int:
    result = 0

    for item in arr1:
        valid = True
        index = 0

        while valid and index < len(arr2):
            if abs(item - arr2[index]) <= d:
                valid = False

            index += 1

        if valid:
            result += 1

    return result
