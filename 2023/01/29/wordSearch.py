"""
https://leetcode.com/problems/word-search/
Author: Andrew Jarombek
Date: 1/29/2023
"""

from typing import List, Set, Tuple


class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        for i in range(len(board)):
            for j in range(len(board[0])):
                if board[i][j] == word[0] and self.search(board, word[1:], {(i, j)}, (i, j)):
                    return True

        return False

    def search(self, board: List[List[str]], word: str, visited: Set[Tuple[int, int]], location: Tuple[int, int]):
        if len(word) == 0:
            return True

        new_visited = {v for v in visited}
        new_visited.add(location)

        i, j = location
        c = word[0]

        if i - 1 >= 0 and board[i - 1][j] == c and (i - 1, j) not in visited:
            if self.search(board, word[1:], new_visited, (i - 1, j)):
                return True

        if j - 1 >= 0 and board[i][j - 1] == c and (i, j - 1) not in visited:
            if self.search(board, word[1:], new_visited, (i, j - 1)):
                return True

        if i + 1 < len(board) and board[i + 1][j] == c and (i + 1, j) not in visited:
            if self.search(board, word[1:], new_visited, (i + 1, j)):
                return True

        if j + 1 < len(board[0]) and board[i][j + 1] == c and (i, j + 1) not in visited:
            if self.search(board, word[1:], new_visited, (i, j + 1)):
                return True

        return False


if __name__ == '__main__':
    solution = Solution()

    board = [["A", "B", "C", "E"], ["S", "F", "C", "S"], ["A", "D", "E", "E"]]
    word = "ABCCED"
    assert solution.exist(board, word)

    board = [["A", "B", "C", "E"], ["S", "F", "C", "S"], ["A", "D", "E", "E"]]
    word = "ABCB"
    assert not solution.exist(board, word)
