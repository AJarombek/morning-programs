"""
https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
Author: Andrew Jarombek
Date: 9/28/2021
"""


def count_prime_set_bits(left: int, right: int) -> int:
    count = 0

    for i in range(left, right + 1):
        b_string = str(bin(i))

        num = 0
        for c in b_string[2:]:
            if c == '1':
                num += 1

        if is_prime(num):
            count += 1

    return count


# https://en.wikipedia.org/wiki/Primality_test#Python
def is_prime(n: int) -> bool:
    if n <= 3:
        return n > 1
    if n % 2 == 0 or n % 3 == 0:
        return False

    i = 5
    while i ** 2 <= n:
        if n % i == 0 or n % (i + 2) == 0:
            return False
        i += 6

    return True
