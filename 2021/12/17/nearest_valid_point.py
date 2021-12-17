"""
https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/
Author: Andrew Jarombek
Date: 12/17/2021
"""

import math
from typing import List


def nearest_valid_point(x: int, y: int, points: List[List[int]]) -> int:
    smallest_distance = math.inf
    result = -1

    for index, point in enumerate(points):
        if point[0] == x or point[1] == y:
            distance = abs(x - point[0]) + abs(y - point[1])

            if distance < smallest_distance:
                smallest_distance = distance
                result = index

    return result
