"""
https://leetcode.com/problems/largest-substring-between-two-equal-characters/
Author: Andrew Jarombek
Date: 8/22/2022
"""


def max_length_between_equal_characters(s: str) -> int:
    result = -1
    locations = {}

    for i, c in enumerate(s):
        prior = locations.get(c)

        if prior is not None:
            result = max(result, i - prior - 1)
        else:
            locations[c] = i

    return result


if __name__ == '__main__':
    assert max_length_between_equal_characters("aa") == 0
    assert max_length_between_equal_characters("abca") == 2
    assert max_length_between_equal_characters("abc") == -1
