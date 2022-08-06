"""
https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
Author: Andrew Jarombek
Date: 8/5/2022
"""


def freq_alphabets(s: str) -> str:
    chars = []
    index = len(s)

    while index > 0:
        if s[index - 1] == '#':
            chars.append(chr(ord('a') + int(s[index - 3:index - 1]) - 1))
            index -= 3
        else:
            chars.append(chr(ord('a') + int(s[index - 1]) - 1))
            index -= 1

    chars.reverse()
    return ''.join(chars)


if __name__ == '__main__':
    assert freq_alphabets("114#425#") == "andy"
