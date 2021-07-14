"""
https://leetcode.com/problems/palindrome-number/
Author: Andrew Jarombek
Date: 7/14/2021
"""


def is_palindrome(x):
    return str(x)[::-1] == str(x)


if __name__ == '__main__':
    assert is_palindrome(121)
    assert not is_palindrome(-121)
    assert not is_palindrome(10)
