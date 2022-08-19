"""
https://leetcode.com/problems/make-the-string-great/
Author: Andrew Jarombek
Date: 8/18/2022
"""


def make_good(s: str) -> str:
    result = []
    index = 0

    while index < len(s):
        if len(result) > 0 and s[index].lower() == result[-1].lower() and s[index] != result[-1]:
            result.pop()
        else:
            result.append(s[index])

        index += 1

    return ''.join(result)


if __name__ == '__main__':
    assert make_good("aAabc") == "abc"
    assert make_good("abBAcC") == ""
