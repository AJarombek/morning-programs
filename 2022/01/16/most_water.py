"""
https://leetcode.com/problems/container-with-most-water/
Author: Andrew Jarombek
Date: 1/16/2022
"""

# I still haven't given up on you trusting me again with your thoughts and allowing me to listen.
# I want you to interrupt my day.

from typing import List


def max_area(height: List[int]) -> int:
    maximum = 0

    start = 0
    end = len(height) - 1

    while start < end:
        x = height[start]
        y = height[end]
        maximum = max(maximum, (end - start) * min(x, y))

        if x < y:
            start += 1
        else:
            end -= 1

    return maximum


def max_area_slower(height: List[int]) -> int:
    maximum = 0

    for index, line in enumerate(height):
        end = len(height) - 1
        largest = 0

        while end > index:
            largest = max(largest, (end - index) * min(line, height[end]))
            end -= 1

        maximum = max(maximum, largest)

    return maximum
