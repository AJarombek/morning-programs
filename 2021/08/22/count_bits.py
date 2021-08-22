"""
Problem: https://leetcode.com/problems/counting-bits/
Author: Andrew Jarombek
Date: 8/22/2021
"""


from typing import List


def count_bits(n: int) -> List[int]:
    return [count_on_bits(num) for num in range(n + 1)]


def count_on_bits(n: int) -> int:
    count = 0

    while n > 1:
        count += n % 2
        n //= 2

    return count + n


if __name__ == '__main__':
    assert count_bits(5) == [0, 1, 1, 2, 1, 2]
