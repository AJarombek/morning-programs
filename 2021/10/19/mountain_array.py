"""
https://leetcode.com/problems/valid-mountain-array/
Author: Andrew Jarombek
Date: 10/19/2021
"""

from typing import List


def valid_mountain_array(arr: List[int]) -> bool:
    if len(arr) <= 2:
        return False

    up_segment = False
    down_segment = False
    prev = arr[0]

    for i in range(1, len(arr)):
        if down_segment:
            if arr[i] >= prev:
                return False
        else:
            if arr[i] == prev:
                return False
            elif arr[i] < prev:
                down_segment = True
            else:
                up_segment = True

        prev = arr[i]

    return up_segment and down_segment
