"""
https://leetcode.com/problems/maximum-units-on-a-truck/
Author: Andrew Jarombek
Date: 12/13/2021
"""

from typing import List


def maximum_units(box_types: List[List[int]], truck_size: int) -> int:
    sorted_box_types = sorted(box_types, key=lambda x: -x[1])

    result = 0
    index = 0

    while truck_size > 0 and index < len(sorted_box_types):
        result += min(sorted_box_types[index][0], truck_size) * sorted_box_types[index][1]
        truck_size -= sorted_box_types[index][0]
        index += 1

    return result
