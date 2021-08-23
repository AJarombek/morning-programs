"""
Problem: https://leetcode.com/problems/reverse-vowels-of-a-string/
Author: Andrew Jarombek
Date: 8/23/2021
"""


def reverse_vowels(s: str) -> str:
    s_list = list(s)
    vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}

    right = None
    left = None

    right_index = len(s) - 1
    left_index = 0

    while right_index >= left_index:
        if left is None:
            if s[left_index] in vowels:
                left = left_index

            left_index += 1

        if right is None:
            if s[right_index] in vowels:
                right = right_index

            right_index -= 1

        if left is not None and right is not None:
            s_list[left] = s[right]
            s_list[right] = s[left]

            right = None
            left = None

    return ''.join(s_list)


if __name__ == '__main__':
    assert reverse_vowels('hello') == 'holle'
