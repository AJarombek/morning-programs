"""
Problem: https://leetcode.com/problems/excel-sheet-column-number/
Author: Andrew Jarombek
Date: 8/5/2021
"""


def title_to_number(column_title: str) -> int:
    result = 0

    for i in range(len(column_title)):
        val = ord(column_title[-1 - i]) - ord('A') + 1
        result += val * (26 ** i)

    return result


if __name__ == '__main__':
    assert title_to_number('A') == 1
    assert title_to_number('AB') == 28
    assert title_to_number('ZY') == 701
    assert title_to_number('FXSHRXW') == 2147483647
