"""
https://leetcode.com/problems/available-captures-for-rook/
Author: Andrew Jarombek
Date: 10/24/2021
"""

from typing import List


def num_captures(board: List[List[str]]) -> int:
    location = None

    for i in range(len(board)):
        for j in range(len(board[0])):
            if board[i][j] == "R":
                location = (i, j)
                break

    x, y = location
    result = 0

    for i in range(x - 1, -1, -1):
        cell = board[i][y]
        if cell == 'B':
            break
        elif cell == 'p':
            result += 1
            break

    for i in range(x + 1, len(board)):
        cell = board[i][y]
        if cell == 'B':
            break
        elif cell == 'p':
            result += 1
            break

    for i in range(y - 1, -1, -1):
        cell = board[x][i]
        if cell == 'B':
            break
        elif cell == 'p':
            result += 1
            break

    for i in range(x + 1, len(board[0])):
        cell = board[x][i]
        if cell == 'B':
            break
        elif cell == 'p':
            result += 1
            break

    return result
