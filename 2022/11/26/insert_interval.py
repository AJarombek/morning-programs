"""
https://leetcode.com/problems/insert-interval/
Author: Andrew Jarombek
Date: 11/26/2022
"""

from typing import List


def insert(intervals: List[List[int]], new_interval: List[int]) -> List[List[int]]:
    if len(intervals) == 0:
        return [new_interval]

    result = []
    index = 0

    while index < len(intervals) and intervals[index][1] < new_interval[0]:
        result.append(intervals[index])
        index += 1

    start = min(intervals[index][0] if index < len(intervals) else math.inf, new_interval[0])
    end = new_interval[1]

    while index < len(intervals) and intervals[index][0] <= end:
        end = max(end, intervals[index][1])
        index += 1

    result.append([start, end])
    return result + intervals[index:]


if __name__ == '__main__':
    assert insert([[1, 3], [6, 9]], [2, 5]) == [[1, 5], [6, 9]]
    assert insert([[1, 2], [3, 5], [6, 7], [8, 10], [12, 16]], [4, 8]) == [[1, 2], [3, 10], [12, 16]]
