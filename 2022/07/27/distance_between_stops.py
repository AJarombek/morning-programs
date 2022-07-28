"""
https://leetcode.com/problems/distance-between-bus-stops/
Author: Andrew Jarombek
Date: 7/27/2022
"""

from typing import List


def distance_between_bus_stops(distance: List[int], start: int, destination: int) -> int:
    forwards = 0
    index = start

    while index != destination:
        forwards += distance[index]
        index = (index + 1) % len(distance)

    backwards = 0
    index = start

    while index != destination:
        index = len(distance) - 1 if index == 0 else index - 1
        backwards += distance[index]

    return min(forwards, backwards)


if __name__ == '__main__':
    assert distance_between_bus_stops([1, 2, 3, 4], 0, 1) == 1
    assert distance_between_bus_stops([1, 2, 3, 4], 0, 2) == 3
    assert distance_between_bus_stops([1, 2, 3, 4], 0, 3) == 4
