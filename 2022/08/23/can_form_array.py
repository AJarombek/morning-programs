"""
https://leetcode.com/problems/check-array-formation-through-concatenation/
Author: Andrew Jarombek
Date: 8/23/2022
"""

from typing import List


def can_form_array(arr: List[int], pieces: List[List[int]]) -> bool:
    pieces_map = {}

    for piece in pieces:
        pieces_map[piece[0]] = piece

    result = []
    index = 0
    count = 0

    while index < len(arr) and count < len(pieces):
        piece = pieces_map.get(arr[index], [])
        result += piece

        index += len(piece)
        count += 1

    return result == arr


if __name__ == '__main__':
    assert can_form_array([15, 88], [[88], [15]])
    assert not can_form_array([49, 18, 16], [[16, 18, 49]])
    assert can_form_array([91, 4, 64, 78], [[78], [4, 64], [91]])
