"""
https://leetcode.com/problems/maximum-number-of-balloons/
Author: Andrew Jarombek
Date: 7/28/2022
"""

import math


def max_number_of_balloons(text: str) -> int:
    valid_chars = {'b': 1, 'a': 1, 'l': 2, 'o': 2, 'n': 1}
    chars = {}

    for c in text:
        chars[c] = chars.get(c, 0) + 1

    result = math.inf

    for key, value in valid_chars.items():
        result = min(result, chars.get(key, 0) // value)

    return result


if __name__ == '__main__':
    assert max_number_of_balloons("nlaebolko") == 1
