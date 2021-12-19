"""
https://leetcode.com/problems/find-center-of-star-graph/
Author: Andrew Jarombek
Date: 12/19/2021
"""

from typing import List


def find_center(edges: List[List[int]]) -> int:
    if edges[0][0] == edges[1][0] or edges[0][0] == edges[1][1]:
        return edges[0][0]
    else:
        return edges[0][1]
