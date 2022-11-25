"""
https://leetcode.com/problems/merge-intervals/
Author: Andrew Jarombek
Date: 11/25/2022
"""

from typing import List


def merge(intervals: List[List[int]]) -> List[List[int]]:
    intervals = sorted(intervals, key=lambda x: x[0])

    result = []
    start = intervals[0][0]
    end = intervals[0][1]
    index = 1

    while index < len(intervals):
        next_start = intervals[index][0]
        next_end = intervals[index][1]

        if next_start > end:
            result.append([start, end])
            start = next_start
            end = next_end
        else:
            end = max(end, next_end)

        index += 1

    result.append([start, end])
    return result


if __name__ == '__main__':
    assert merge([[1, 3], [2, 6], [8, 10], [15, 18]]) == [[1, 6], [8, 10], [15, 18]]
    assert merge([[1, 4], [4, 5]]) == [[1, 5]]
