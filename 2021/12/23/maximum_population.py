"""
https://leetcode.com/problems/maximum-population-year/
Author: Andrew Jarombek
Date: 12/23/2021
"""

from typing import List


def maximum_population(logs: List[List[int]]) -> int:
    years = set([item for items in logs for item in items])
    max_year = 0
    max_count = 0
    count = 0

    for year in sorted(years):
        for log in logs:
            start = log[0]
            end = log[1]

            if start == year:
                count += 1
            elif end == year:
                count -= 1

        if count > max_count:
            max_count = count
            max_year = year

    return max_year
