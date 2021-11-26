"""
https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/
Author: Andrew Jarombek
Date: 11/26/2021
"""

from typing import List


def busy_student(start_time: List[int], end_time: List[int], query_time: int) -> int:
    count = 0

    for i in range(len(start_time)):
        if start_time[i] <= query_time and end_time[i] >= query_time:
            count += 1

    return count
