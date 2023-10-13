"""
Unit tests for the surrounded-regions program.
Author: Andrew Jarombek
Date: 10/13/2023
"""

import pytest
from program import Solution


@pytest.fixture
def empty_board():
    return []


@pytest.fixture
def board_with_border_o():
    return [
        ['X', 'X', 'X', 'X'],
        ['O', 'O', 'X', 'X'],
        ['X', 'X', 'X', 'X']
    ]


@pytest.fixture
def board_with_surrounded_o():
    return [
        ['X', 'X', 'X', 'X'],
        ['X', 'O', 'O', 'X'],
        ['X', 'O', 'X', 'X'],
        ['X', 'X', 'X', 'X']
    ]


def test_solve_empty_board(empty_board):
    Solution.solve(empty_board)
    assert empty_board == []


def test_solve_board_with_border_o(board_with_border_o):
    expected_board = [
        ['X', 'X', 'X', 'X'],
        ['O', 'O', 'X', 'X'],
        ['X', 'X', 'X', 'X']
    ]
    Solution.solve(board_with_border_o)
    assert board_with_border_o == expected_board


def test_solve_board_with_surrounded_o(board_with_surrounded_o):
    expected_board = [
        ['X', 'X', 'X', 'X'],
        ['X', 'X', 'X', 'X'],
        ['X', 'X', 'X', 'X'],
        ['X', 'X', 'X', 'X']
    ]
    Solution.solve(board_with_surrounded_o)
    assert board_with_surrounded_o == expected_board

