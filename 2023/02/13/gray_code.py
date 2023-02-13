"""
https://leetcode.com/problems/gray-code/
https://en.wikipedia.org/wiki/Gray_code
Author: Andrew Jarombek
Date: 2/13/2023
"""


def gray_code(n: int) -> list[int]:
    result = [0, 1]

    for i in range(1, n):
        for j in range(len(result) - 1, -1, -1):
            result.append(result[j] + 2 ** i)

    return result


if __name__ == '__main__':
    assert gray_code(1) == [0, 1]
    assert gray_code(2) == [0, 1, 3, 2]
    assert gray_code(3) == [0, 1, 3, 2, 6, 7, 5, 4]
