"""
https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/
Author: Andrew Jarombek
Date: 1/6/2022
"""

from typing import List
import heapq


def max_subsequence(nums: List[int], k: int) -> List[int]:
    heap = []
    result = []

    for num in nums[:k]:
        heapq.heappush(heap, num)
        result.append(num)

    for num in nums[k:]:
        smallest = heap[0]

        if num > smallest:
            heapq.heappop(heap)
            heapq.heappush(heap, num)
            result.remove(smallest)
            result.append(num)

    return result
