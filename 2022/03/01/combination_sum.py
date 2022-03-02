"""
https://leetcode.com/problems/combination-sum/
Author: Andrew Jarombek
Date: 3/1/2022
"""

from typing import List
import collections


def combination_sum(candidates: List[int], target: int) -> List[List[int]]:
    candidates.sort()

    result = []
    queue = collections.deque()

    for candidate in candidates:
        if candidate == target:
            result.append([candidate])
        elif candidate < target:
            queue.append((candidate, [candidate]))

        queue_length = len(queue)
        for i in range(queue_length):
            total, values = queue.popleft()

            if candidate + total == target:
                values.append(candidate)
                result.append(values)
            else:
                queue.append((total, values))

                while total + candidate <= target:
                    values = values.copy()
                    values.append(candidate)
                    total += candidate

                    if total == target:
                        result.append(values)
                    else:
                        queue.append((total, values))

    return result
