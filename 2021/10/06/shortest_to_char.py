"""
https://leetcode.com/problems/shortest-distance-to-a-character/
Author: Andrew Jarombek
Date: 10/6/2021
"""

from typing import List


def shortest_to_char(s: str, c: str) -> List[int]:
    result = [len(s) for _ in range(len(s))]

    for index, char in enumerate(s):
        if char == c:
            result[index] = 0

            distance = 1
            for i in range(index - 1, -1, -1):
                if result[i] > distance:
                    result[i] = distance
                    distance += 1
                else:
                    break

            distance = 1
            for i in range(index + 1, len(s)):
                if result[i] > distance:
                    result[i] = distance
                    distance += 1
                else:
                    break

    return result


if __name__ == '__main__':
    assert shortest_to_char('aaab', 'b') == [3, 2, 1, 0]
