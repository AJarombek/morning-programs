"""
https://leetcode.com/problems/rectangle-overlap/
Author: Andrew Jarombek
Date: 10/8/2021
"""

from typing import List


def is_rectangle_overlap(rec1: List[int], rec2: List[int]) -> bool:
    no_overlap = rec1[2] <= rec2[0] or rec1[0] >= rec2[2] or rec1[3] <= rec2[1] or rec1[1] >= rec2[3]
    return not no_overlap
