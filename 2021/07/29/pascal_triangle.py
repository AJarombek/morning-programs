"""
https://leetcode.com/problems/pascals-triangle/
Author: Andrew Jarombek
Date: 7/28/2021
"""

from typing import List


def generate(num_rows: int) -> List[List[int]]:
    result = [[1]]

    for row in range(1, num_rows):
        row_result = [1]

        for i in range(1, row):
            row_result.append(result[-1][i - 1] + result[-1][i])

        row_result.append(1)
        result.append(row_result)

    return result


if __name__ == '__main__':
    result = generate(5)
    assert len(result) == 5
    assert result[0] == [1]
    assert result[1] == [1, 1]
    assert result[2] == [1, 2, 1]
    assert result[3] == [1, 3, 3, 1]
    assert result[4] == [1, 4, 6, 4, 1]
