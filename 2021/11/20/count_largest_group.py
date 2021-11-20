"""
https://leetcode.com/problems/count-largest-group/
Author: Andrew Jarombek
Date: 11/20/2021
"""


def count_largest_group(n: int) -> int:
    groups = {}
    largest_group = 0
    result = 0

    for i in range(1, n + 1):
        m = i
        count = 0

        while m > 0:
            count += m % 10
            m //= 10

        group = groups.get(count, [])
        group.append(n)
        groups[count] = group

        if len(group) > largest_group:
            largest_group = len(group)
            result = 1
        elif len(group) == largest_group:
            result += 1

    return result
