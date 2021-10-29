"""
https://leetcode.com/problems/matrix-cells-in-distance-order/
Author: Andrew Jarombek
Date: 10/28/2021
"""

from typing import List


def all_cells_dist_order(rows: int, cols: int, r_center: int, c_center: int) -> List[List[int]]:
    result = [[r_center, c_center]]
    result_set = set()
    result_set.add((r_center, c_center))
    index = 0

    while index < len(result):
        r = result[index][0]
        c = result[index][1]

        if r > 0 and (r - 1, c) not in result_set:
            result.append([r - 1, c])
            result_set.add((r - 1, c))

        if r < rows - 1 and (r + 1, c) not in result_set:
            result.append([r + 1, c])
            result_set.add((r + 1, c))

        if c > 0 and (r, c - 1) not in result_set:
            result.append([r, c - 1])
            result_set.add((r, c - 1))

        if c < cols - 1 and (r, c + 1) not in result_set:
            result.append([r, c + 1])
            result_set.add((r, c + 1))

        index += 1

    return result
