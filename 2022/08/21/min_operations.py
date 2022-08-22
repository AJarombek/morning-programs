"""
https://leetcode.com/problems/crawler-log-folder/
Author: Andrew Jarombek
Date: 8/21/2022
"""

from typing import List


def min_operations(logs: List[str]) -> int:
    depth = 0

    for log in logs:
        if log == '../':
            depth = max(0, depth - 1)
        elif log != './':
            depth += 1

    return depth


if __name__ == '__main__':
    assert min_operations(["d1/", "d2/", "../", "d21/", "./"]) == 2
    assert min_operations(["d1/", "d2/", "./", "d3/", "../", "d31/"]) == 3
    assert min_operations(["d1/", "../", "../", "../"]) == 0
