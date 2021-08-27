"""
Problem: https://leetcode.com/problems/find-the-difference/
Author: Andrew Jarombek
Date: 8/27/2021
"""


def find_the_difference(s: str, t: str) -> str:
    char_dict = {}

    for i in range(len(t)):
        if i < len(s):
            c1 = s[i]

            val1 = char_dict[c1] - 1 if c1 in char_dict else -1

            if val1 == 0:
                del char_dict[c1]
            else:
                char_dict[c1] = val1

        c2 = t[i]

        val2 = char_dict[c2] + 1 if c2 in char_dict else 1

        if val2 == 0:
            del char_dict[c2]
        else:
            char_dict[c2] = val2

    return list(char_dict.keys())[0]


if __name__ == '__main__':
    assert find_the_difference("abca", "abcab") == "b"
