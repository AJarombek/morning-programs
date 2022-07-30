"""
https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
Author: Andrew Jarombek
Date: 7/29/2022
"""

from typing import List


def min_cost_to_move_chips(position: List[int]) -> int:
    x = 0
    y = 0

    for num in position:
        if num % 2 == 0:
            x += 1
        else:
            y += 1

    return min(x, y)


if __name__ == '__main__':
    assert min_cost_to_move_chips([1, 2, 3]) == 1
