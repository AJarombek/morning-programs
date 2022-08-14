"""
https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
Author: Andrew Jarombek
Date: 8/14/2022
"""

from typing import List


def average(salary: List[int]) -> float:
    total = salary[0]
    minimum = total
    maximum = total

    for value in salary[1:]:
        total += value
        minimum = min(minimum, value)
        maximum = max(maximum, value)

    return (total - minimum - maximum) / (len(salary) - 2)


if __name__ == '__main__':
    assert average([4000, 3000, 1000, 2000]) == 2500
