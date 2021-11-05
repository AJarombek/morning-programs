"""
https://leetcode.com/problems/n-th-tribonacci-number/
Author: Andrew Jarombek
Date: 11/4/2021
"""


def tribonacci(n: int) -> int:
    if n == 0:
        return 0

    if n < 3:
        return 1

    first = 0
    second = 1
    third = 1

    for i in range(3, n + 1):
        num = first + second + third
        first = second
        second = third
        third = num

    return third
