"""
https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/
Author: Andrew Jarombek
Date: 8/2/2022
"""

from typing import List


def tictactoe(moves: List[List[int]]) -> str:
    board = [['0', '1', '2'], ['3', '4', '5'], ['6', '7', '8']]

    for index, move in enumerate(moves):
        board[move[0]][move[1]] = 'A' if index % 2 == 0 else 'B'

    for i in range(3):
        if board[i][0] == board[i][1] == board[i][2]:
            return board[i][0]

    for i in range(3):
        if board[0][i] == board[1][i] == board[2][i]:
            return board[0][i]

    if board[0][0] == board[1][1] == board[2][2]:
        return board[0][0]

    if board[2][0] == board[1][1] == board[0][2]:
        return board[1][1]

    return "Pending" if len(moves) < 9 else "Draw"


if __name__ == '__main__':
    assert tictactoe([[0, 0], [2, 0], [1, 1], [2, 1], [2, 2]]) == "A"
    assert tictactoe([[1, 2], [2, 1], [0, 0], [0, 1], [2, 0], [0, 2], [2, 2], [1, 1]]) == "B"
    assert tictactoe([[0, 0], [1, 1], [2, 0], [1, 0], [1, 2], [2, 1], [0, 1], [0, 2], [2, 2]]) == "Draw"
    assert tictactoe([[0, 0], [1, 1], [2, 0], [1, 0], [1, 2], [2, 1], [0, 1], [0, 2]]) == "Pending"
