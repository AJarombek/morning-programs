"""
https://leetcode.com/problems/baseball-game/
Author: Andrew Jarombek
Date: 9/22/2021
"""

from typing import List


def calc_points(ops: List[str]) -> int:
    scores = []

    for op in ops:
        if op == "+":
            scores.append(scores[-1] + scores[-2])
        elif op == "D":
            scores.append(scores[-1] * 2)
        elif op == "C":
            scores.pop()
        else:
            scores.append(int(op))

    return sum(scores)