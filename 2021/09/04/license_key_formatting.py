"""
https://leetcode.com/problems/license-key-formatting/
Author: Andrew Jarombek
Date: 9/4/2021
"""


def license_key_formatting(s: str, k: int) -> str:
    result = ""
    matches = 0

    for c in s[::-1]:
        if c != '-':
            if matches > 0 and matches % k == 0:
                result = f'{c.upper()}-{result}'
            else:
                result = f'{c.upper()}{result}'

            matches += 1

    return result
