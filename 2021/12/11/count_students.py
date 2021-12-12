"""
https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
Author: Andrew Jarombek
Date: 12/11/2021
"""

from typing import List
import collections


def count_students(students: List[int], sandwiches: List[int]) -> int:
    count = 0
    index = 0
    queue = collections.deque(students)

    while index < len(sandwiches) and count < len(queue):
        student = queue.popleft()

        if student == sandwiches[index]:
            count = 0
            index += 1
        else:
            count += 1
            queue.append(student)

    return count
