"""
https://leetcode.com/problems/valid-sudoku/
Author: Andrew Jarombek
Date: 2/10/2022
"""

from typing import List


def is_valid_sudoku(board: List[List[str]]) -> bool:
    for row in board:
        values = set()

        for item in row:
            if item != '.' and item in values:
                return False

            values.add(item)

    for col_num in range(9):
        values = set()

        for row_num in range(9):
            item = board[row_num][col_num]
            if item != '.' and item in values:
                return False

            values.add(item)

    for x in range(3):
        for y in range(3):
            values = set()

            for row in range(3):
                for col in range(3):
                    item = board[row + x * 3][col + y * 3]

                    if item != '.' and item in values:
                        return False

                    values.add(item)

    return True
