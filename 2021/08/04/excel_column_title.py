"""
Problem: https://leetcode.com/problems/excel-sheet-column-title/
Author: Andrew Jarombek
Date: 8/4/2021
"""


def convert_to_title(column_number: int) -> str:
    title = ""
    start = ord('A')

    while column_number > 0:
        code = (column_number - 1) % 26
        column_number = (column_number - 1) // 26

        title = chr(start + code) + title

    return title


if __name__ == '__main__':
    assert convert_to_title(1) == 'A'
    assert convert_to_title(28) == 'AB'
    assert convert_to_title(701) == 'ZY'
    assert convert_to_title(2147483647) == 'FXSHRXW'
