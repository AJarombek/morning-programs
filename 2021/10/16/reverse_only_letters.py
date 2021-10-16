"""
https://leetcode.com/problems/reverse-only-letters/
Author: Andrew Jarombek
Date: 10/16/2021
"""


def reverse_only_letters(s: str) -> str:
    start = 0
    end = len(s) - 1

    start_s = ""
    end_s = ""

    while start <= end:
        c = ord(s[start])

        if (c >= 65 and c <= 90) or (c >= 97 and c <= 122):
            swapped = False

            while end != start:
                c_end = ord(s[end])
                end -= 1

                if (c_end >= 65 and c_end <= 90) or (c_end >= 97 and c_end <= 122):
                    start_s += chr(c_end)
                    end_s = chr(c) + end_s
                    swapped = True
                    break
                else:
                    end_s = chr(c_end) + end_s

            if not swapped:
                start_s += chr(c)
        else:
            start_s += chr(c)

        start += 1

    return start_s + end_s
