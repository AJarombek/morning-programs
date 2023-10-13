"""
https://leetcode.com/problems/surrounded-regions/
Author: Andrew Jarombek
Date: 10/13/2023
"""


class Solution:
    @staticmethod
    def solve(board: list[list[str]]) -> None:
        if len(board) == 0:
            return

        for i in [0, len(board) - 1]:
            for j in range(len(board[i])):
                if board[i][j] == 'O':
                    Solution.dfs(board, i, j)

        for i in range(len(board)):
            for j in [0, len(board[0]) - 1]:
                if board[i][j] == 'O':
                    Solution.dfs(board, i, j)

        for i in range(len(board)):
            for j in range(len(board[i])):
                if board[i][j] == '.':
                    board[i][j] = 'O'
                else:
                    board[i][j] = 'X'

    @staticmethod
    def dfs(board: list[list[str]], i: int, j: int) -> None:
        if 0 <= i < len(board) and 0 <= j < len(board[0]) and board[i][j] == 'O':
            board[i][j] = '.'
            Solution.dfs(board, i - 1, j)
            Solution.dfs(board, i + 1, j)
            Solution.dfs(board, i, j - 1)
            Solution.dfs(board, i, j + 1)
