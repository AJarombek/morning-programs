"""
https://leetcode.com/problems/fibonacci-number/
Author: Andrew Jarombek
Date: 10/22/2021
"""


def fib(n: int) -> int:
    if n < 2:
        return n

    x = 0
    y = 1

    for i in range(2, n):
        z = x + y
        x = y
        y = z

    return x + y


if __name__ == '__main__':
    assert fib(1) == 1
    assert fib(2) == 1
    assert fib(3) == 2
