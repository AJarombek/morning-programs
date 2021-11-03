"""
https://leetcode.com/problems/relative-sort-array/
Author: Andrew Jarombek
Date: 11/2/2021
"""

from typing import List


def relative_sort_array(arr1: List[int], arr2: List[int]) -> List[int]:
    order = {value: index for index, value in enumerate(arr2)}
    return sorted(arr1, key=lambda x: order.get(x, 1001 + x))
