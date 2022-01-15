"""
https://leetcode.com/problems/zigzag-conversion/
Author: Andrew Jarombek
Date: 1/14/2022
"""


def convert(s: str, num_rows: int) -> str:
    if num_rows == 1:
        return s

    rows = [[] for row in range(num_rows)]
    i = 0
    up = False

    for c in s:
        rows[i].append(c)

        if up:
            if i == 0:
                up = False
                i += 1
            else:
                i -= 1
        else:
            if i == num_rows - 1:
                up = True
                i -= 1
            else:
                i += 1

    return "".join("".join(row) for row in rows)
