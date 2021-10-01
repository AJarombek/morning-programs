"""
https://leetcode.com/problems/kth-largest-element-in-a-stream/
Author: Andrew Jarombek
Date: 10/1/2021
"""

from typing import List
import heapq


class KthLargest:
    items = []
    k = 0

    def __init__(self, k: int, nums: List[int]):
        nums.sort()
        self.items = nums
        self.k = k

    def add(self, val: int) -> int:
        start = 0
        end = len(self.items)
        mid = end // 2

        while start < end:
            if val < self.items[mid]:
                end = mid
            elif val == self.items[mid]:
                end = mid
                start = mid
            else:
                start = mid + 1

            mid = (start + end) // 2

        self.items.insert(start, val)
        return self.items[0 - self.k]


# Faster solution using a heap (priority queue)
class KthLargestHeap:
    items = None
    k = 0

    def __init__(self, k: int, nums: List[int]):
        self.items = nums
        self.k = k
        heapq.heapify(self.items)

        while len(self.items) > k:
            heapq.heappop(self.items)

    def add(self, val: int) -> int:
        heapq.heappush(self.items, val)

        if len(self.items) > self.k:
            heapq.heappop(self.items)

        return self.items[0]


if __name__ == '__main__':
    array = KthLargest(3, [4, 5, 8, 2])
    array.add(3)
    array.add(5)
    array.add(10)
    array.add(9)
    array.add(4)
