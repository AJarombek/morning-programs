"""
https://leetcode.com/problems/spiral-matrix-ii
Author: Andrew Jarombek
Date: 11/27/2022
"""

from typing import List


def generate_matrix(n: int) -> List[List[int]]:
    order = [(1, 0), (0, 1), (-1, 0), (0, -1)]

    result = [[0] * n for _ in range(n)]
    i = 1
    x = 0
    y = 0
    direction = 0

    while x >= 0 and x < n and y >= 0 and y < n and result[y][x] == 0:
        result[y][x] = i

        next_x = x + order[direction][0]
        next_y = y + order[direction][1]

        if next_x < 0 or next_x == n or next_y < 0 or next_y == n or result[next_y][next_x] != 0:
            direction = (direction + 1) % 4
            x = x + order[direction][0]
            y = y + order[direction][1]
        else:
            x = next_x
            y = next_y

        i += 1

    return result


if __name__ == '__main__':
    assert generate_matrix(3) == [[1, 2, 3], [8, 9, 4], [7, 6, 5]]
    assert generate_matrix(1) == [[1]]
