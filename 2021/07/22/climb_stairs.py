"""
https://leetcode.com/problems/climbing-stairs/
i know places
Author: Andrew Jarombek
Date: 7/22/2021
"""


def climb_stairs(n: int) -> int:
    return fib_iterative(n + 1)


def fib_recursive(n: int) -> int:
    if n == 0:
        return 0
    elif n == 1:
        return 1
    elif n > 1:
        return fib_recursive(n - 1) + fib_recursive(n - 2)


def fib_iterative(n: int):
    first = 1
    second = 0

    for i in range(1, n):
        new_value = first + second
        second = first
        first = new_value

    return first


if __name__ == '__main__':
    assert climb_stairs(1) == 1
    assert climb_stairs(2) == 2
    assert climb_stairs(3) == 3
    assert climb_stairs(4) == 5
    assert climb_stairs(5) == 8
    assert climb_stairs(6) == 13
