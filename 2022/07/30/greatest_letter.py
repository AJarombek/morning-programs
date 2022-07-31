"""
https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case/
Author: Andrew Jarombek
Date: 7/30/2022
"""


def greatest_letter(s: str) -> str:
    result = ''
    chars = set()

    for c in s:
        chars.add(c)

    for c in s:
        if 'A' <= c <= 'Z':
            lowercase_c = chr(ord(c) + 32)

            if lowercase_c in chars and c > result:
                result = c

    return result


if __name__ == '__main__':
    assert greatest_letter("AbBa") == "B"
    assert greatest_letter("AB") == ""
