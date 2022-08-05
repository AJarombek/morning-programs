"""
https://leetcode.com/problems/find-the-k-beauty-of-a-number/
Author: Andrew Jarombek
Date: 8/4/2022
"""


def divisor_substrings(num: int, k: int) -> int:
    count = 0
    number = str(num)

    for i in range(len(number) - k + 1):
        val = int(number[i:i + k])
        if val != 0 and num % val == 0:
            count += 1

    return count


if __name__ == '__main__':
    assert divisor_substrings(240, 2) == 2
