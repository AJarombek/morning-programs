"""
https://leetcode.com/problems/longest-nice-substring/
Author: Andrew Jarombek
Date: 12/16/2021
"""


def longest_nice_substring(s: str) -> str:
    index = 0
    longest = ""

    while index < len(s) - len(longest):
        values = {}
        outstanding = set()

        for i in range(index, len(s)):
            is_lower = s[i].islower()
            lower = s[i].lower()

            value = values.get(lower)

            if value is None:
                outstanding.add(lower)

                if is_lower:
                    values[lower] = -1
                else:
                    values[lower] = 1
            else:
                if is_lower and value == 1 or not is_lower and value == -1:
                    values[lower] = 0
                    outstanding.remove(lower)

                if len(outstanding) == 0 and i - index + 1 > len(longest):
                    longest = s[index:i + 1]

        index += 1

    return longest
