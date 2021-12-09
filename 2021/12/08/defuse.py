"""
https://leetcode.com/problems/defuse-the-bomb/
Author: Andrew Jarombek
Date: 12/8/2021
"""

from typing import List


def decrypt(code: List[int], k: int) -> List[int]:
    val = 0
    result = []

    if k == 0:
        for i in range(len(code)):
            result.append(0)
    elif k > 0:
        for i in range(k):
            val += code[i]

        for i in range(len(code)):
            val -= code[i]
            val += code[(i + k) % len(code)]
            result.append(val)
    else:
        for i in range(-1, k - 1, -1):
            val += code[i]

        for i in range(len(code)):
            result.append(val)
            val -= code[i + k]
            val += code[i]

    return result
