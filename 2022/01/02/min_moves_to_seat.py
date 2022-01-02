"""
https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/
Author: Andrew Jarombek
Date: 1/2/2022
"""

from typing import List


def min_moves_to_seat(seats: List[int], students: List[int]) -> int:
    sorted_seats = sorted(seats)
    sorted_students = sorted(students)

    result = 0
    for i in range(len(seats)):
        result += abs(sorted_seats[i] - sorted_students[i])

    return result
