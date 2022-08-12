"""
https://leetcode.com/problems/destination-city/
Author: Andrew Jarombek
Date: 8/11/2022
"""

from typing import List


def destination_city(paths: List[List[str]]) -> str:
    sources = set()
    destinations = set()

    for path in paths:
        sources.add(path[0])
        destinations.add(path[1])

    destination = destinations - sources
    return destination.pop()


if __name__ == '__main__':
    assert destination_city([["B", "C"], ["D", "B"], ["C", "A"]]) == "A"
    assert destination_city([["B", "Z"]]) == "Z"
