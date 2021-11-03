"""
https://leetcode.com/problems/number-of-equivalent-domino-pairs/
Author: Andrew Jarombek
Date: 11/3/2021
"""

from typing import List


def num_equiv_domino_pairs(dominoes: List[List[int]]) -> int:
    pairs = 0

    domino_map = {}

    for domino in dominoes:
        sorted_domino = (min(domino[0], domino[1]), max(domino[0], domino[1]))
        count = domino_map.get(sorted_domino, 0)
        pairs += count
        domino_map[sorted_domino] = count + 1

    return pairs
