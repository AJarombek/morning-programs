"""
https://leetcode.com/problems/greatest-common-divisor-of-strings/
Author: Andrew Jarombek
Date: 10/31/2021
"""


def gcd_of_strings(str1: str, str2: str) -> str:
    size = min(len(str1), len(str2))
    while size > 0:
        if len(str1) % size == 0 and len(str2) % size == 0 and str1[0:size] == str2[0:size]:
            str1_match = str1[0:size] * (len(str1) // size)
            str2_match = str2[0:size] * (len(str2) // size)

            if str1_match == str1 and str2_match == str2:
                return str1[0:size]
        size -= 1

    return ""
