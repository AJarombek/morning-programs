"""
https://leetcode.com/problems/assign-cookies/
Author: Andrew Jarombek
Date: 9/2/2021
"""

from typing import List


def find_content_children(g: List[int], s: List[int]) -> int:
    if len(s) == 0:
        return 0

    g.sort()
    s.sort()

    cookie_index = 0
    count = 0

    for child in g:
        while s[cookie_index] < child:
            cookie_index += 1

            if cookie_index == len(s):
                return count

        count += 1
        cookie_index += 1

        if cookie_index == len(s):
            return count

    return count


if __name__ == '__main__':
    assert find_content_children([1, 2, 3], [1, 1]) == 1
