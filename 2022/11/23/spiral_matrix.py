"""
https://leetcode.com/problems/spiral-matrix
Author: Andrew Jarombek
Date: 11/23/2022
"""

from typing import List


def spiral_order(matrix: List[List[int]]) -> List[int]:
    order = [(1, 0), (0, 1), (-1, 0), (0, -1)]
    x_length = len(matrix[0])
    y_length = len(matrix)

    result = []
    visited = set()
    x = 0
    y = 0
    direction = 0

    while all([x >= 0, x < x_length, y >= 0, y < y_length, f"{x},{y}" not in visited]):
        cell = matrix[y][x]
        result.append(cell)
        visited.add(f"{x},{y}")

        next_x = x + order[direction][0]
        next_y = y + order[direction][1]

        if any([
            next_x < 0,
            next_x >= x_length,
            next_y < 0,
            next_y >= y_length,
            f"{next_x},{next_y}" in visited
        ]):
            direction = (direction + 1) % 4
            x = x + order[direction][0]
            y = y + order[direction][1]
        else:
            x = next_x
            y = next_y

    return result


if __name__ == '__main__':
    assert spiral_order([[1, 2, 3], [4, 5, 6], [7, 8, 9]]) == [1, 2, 3, 6, 9, 8, 7, 4, 5]
