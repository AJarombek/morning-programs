"""
Problem: https://leetcode.com/problems/reverse-bits/
Author: Andrew Jarombek
Date: 8/6/2021
"""


def reverse_bits(n: int) -> int:
    binary = str(bin(n))[:1:-1]
    binary_suffix = "0" * (32 - len(binary))
    return int(binary + binary_suffix, 2)


if __name__ == '__main__':
    assert reverse_bits(43261596) == 964176192
