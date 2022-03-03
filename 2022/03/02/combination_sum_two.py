"""
https://leetcode.com/problems/combination-sum-ii/
Author: Andrew Jarombek
Date: 3/2/2022
"""

import collections
from typing import List


def combination_sum_two(candidates: List[int], target: int) -> List[List[int]]:
    candidates.sort()

    result = []
    result_set = set()

    queue = collections.deque()
    queue_set = set()

    for candidate in candidates:
        queue_length = len(queue)

        if candidate == target:
            candidate_string = f"[{candidate}]"

            if candidate_string not in result_set:
                result.append([candidate])
                result_set.add(candidate_string)
        elif candidate < target:
            if str([candidate]) not in queue_set:
                queue.append((candidate, [candidate]))
                queue_set.add(str([candidate]))

        for i in range(queue_length):
            total, values = queue.popleft()
            queue_set.remove(str(values))

            if candidate + total == target:
                values.append(candidate)

                if str(values) not in result_set:
                    result.append(values)
                    result_set.add(str(values))
            elif total + candidate <= target:
                if str(values) not in queue_set:
                    queue.append((total, values))
                    queue_set.add(str(values))

                values = values.copy()
                values.append(candidate)
                total += candidate

                if str(values) not in queue_set:
                    queue.append((total, values))
                    queue_set.add(str(values))

    return result
