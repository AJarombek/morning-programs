"""
https://leetcode.com/problems/shuffle-string/
Author: Andrew Jarombek
Date: 8/17/2022
"""

from typing import List


def restore_string(s: str, indices: List[int]) -> str:
    result = [''] * len(indices)

    for source, dest in enumerate(indices):
        result[dest] = s[source]

    return ''.join(result)


if __name__ == '__main__':
    assert restore_string('abc', [2, 0, 1]) == 'bca'
