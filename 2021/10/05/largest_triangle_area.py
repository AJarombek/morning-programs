"""
https://leetcode.com/problems/largest-triangle-area/
Author: Andrew Jarombek
Date: 10/5/2021
"""

from typing import List


def largest_triangle_area(points: List[List[int]]) -> float:
    largest = 0

    for i in range(len(points)):
        x = points[i]

        for j in range(i, len(points)):
            y = points[j]

            for k in range(j, len(points)):
                z = points[k]
                
                # Formula: https://keisan.casio.com/exec/system/1223520411
                size = abs((x[0] * y[1] + y[0] * z[1] + z[0] * x[1] - x[1] * y[0] - y[1] * z[0] - z[1] * x[0]) / 2)
                largest = max(size, largest)

    return largest
