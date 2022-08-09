"""
https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/
Author: Andrew Jarombek
Date: 8/8/2022
"""


def generate_the_string(n: int) -> str:
    if n % 2 == 0:
        return "a" * (n - 1) + "b"

    return "a" * n


if __name__ == '__main__':
    assert generate_the_string(4) == "aaab"
    assert generate_the_string(5) == "aaaaa"
