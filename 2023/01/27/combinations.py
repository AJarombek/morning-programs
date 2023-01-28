"""
https://leetcode.com/problems/combinations/
Author: Andrew Jarombek
Date: 1/27/2023
"""

from itertools import combinations
from typing import List, Tuple, Iterator


# Approach #1 - Using Standard Library

def combine(n: int, k: int) -> Iterator[Tuple[int]]:
    return combinations([i+1 for i in range(n)], k)


# Approach #2 - Custom

def combine_v2(n: int, k: int) -> List[List[int]]:
    return list(custom_combinations([i+1 for i in range(n)], k))


def custom_combinations(values: List[int], k: int) -> Iterator:
    for i in range(len(values)):
        if k == 1:
            yield values[i],
        else:
            for next_val in custom_combinations(values[i+1:], k-1):
                yield (values[i],) + next_val


if __name__ == '__main__':
    result = list(combine(4, 2))
    assert result == [(1, 2), (1, 3), (1, 4), (2, 3), (2, 4), (3, 4)]

    result = list(combine_v2(4, 2))
    assert result == [(1, 2), (1, 3), (1, 4), (2, 3), (2, 4), (3, 4)]
