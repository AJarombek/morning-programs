"""
https://leetcode.com/problems/rank-transform-of-an-array/
Author: Andrew Jarombek
Date: 11/5/2021
"""

import heapq
from typing import List


def array_rank_transform(arr: List[int]) -> List[int]:
    heap = arr.copy()
    heapq.heapify(heap)
    rank = {}

    i = 1
    while len(heap) > 0:
        item = heapq.heappop(heap)
        if item not in rank:
            rank[item] = i
            i += 1

    return [rank[item] for item in arr]
