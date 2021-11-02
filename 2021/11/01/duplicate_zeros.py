"""
https://leetcode.com/problems/duplicate-zeros/
Author: Andrew Jarombek
Date: 11/1/2021
"""

import collections
from typing import List


def duplicate_zeros(arr: List[int]) -> None:
    queue = collections.deque()

    for index, item in enumerate(arr):
        if item == 0:
            queue.appendleft(0)

        queue.appendleft(item)
        arr[index] = queue.pop()
