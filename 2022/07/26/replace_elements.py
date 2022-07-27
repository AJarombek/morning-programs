"""
https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
Author: Andrew Jarombek
Date: 7/26/2022
"""

from typing import List


def replace_elements(arr: List[int]) -> List[int]:
    greatest = arr[-1]
    arr[-1] = -1

    for i in range(len(arr) - 2, -1, -1):
        current = arr[i]
        arr[i] = greatest
        greatest = max(greatest, current)

    return arr


if __name__ == '__main__':
    assert replace_elements([17, 18, 5, 4, 6, 1]) == [18, 6, 6, 6, 1, -1]
    assert replace_elements([400]) == [-1]
