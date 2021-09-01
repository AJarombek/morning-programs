"""
https://leetcode.com/problems/number-of-segments-in-a-string/
Author: Andrew Jarombek
Date: 8/31/2021
"""


def count_segments(s: str) -> int:
    s = s.strip()

    if len(s) == 0:
        return 0

    count = 1
    prev_whitespace = False

    for c in s:
        if c == " ":
            if not prev_whitespace:
                count += 1

            prev_whitespace = True
        else:
            prev_whitespace = False

    return count


if __name__ == '__main__':
    assert count_segments(" why hello. ") == 2
