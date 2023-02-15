"""
https://leetcode.com/problems/decode-ways/
Author: Andrew Jarombek
Date: 2/14/2023
"""

from collections import deque


def num_decodings(s: str) -> int:
    if s[0] == '0':
        return 0

    result = [1, 1]

    for i in range(2, len(s) + 1):
        next_result = 0

        if 1 <= int(s[i - 1]) <= 9:
            next_result += result[1]

        if 10 <= int(s[i - 2:i]) <= 26:
            next_result += result[0]

        result[0] = result[1]
        result[1] = next_result

    return result[1]


def num_decodings_v2(s: str) -> int:
    if s[0] == '0':
        return 0

    result = [0] * (len(s) + 1)
    result[0] = 1
    result[1] = 1

    for i in range(2, len(s) + 1):
        if 1 <= int(s[i - 1]) <= 9:
            result[i] += result[i - 1]

        if 10 <= int(s[i - 2:i]) <= 26:
            result[i] += result[i - 2]

    return result[-1]


def num_decodings_attempt_1(s: str) -> int:
    if s[0] == '0':
        return 0

    queue = deque([0])
    result = 0

    while len(queue) > 0:
        i = queue.popleft()
        c = s[i]

        if i == len(s) - 1:
            if c != '0':
                result += 1

        elif i == len(s) - 2:
            if c == '0':
                continue

            if s[i + 1] != '0':
                result += 1

            val = int(s[i:i + 2])
            if 1 <= val <= 26:
                result += 1

        else:
            if c != '0':
                queue.append(i + 1)

                val = int(s[i:i + 2])
                if val >= 1 and val <= 26:
                    queue.append(i + 2)

    return result
