"""
Problem: https://leetcode.com/problems/implement-stack-using-queues/
Author: Andrew Jarombek
Date: 8/13/2021
"""

# Running the 5K in Harlem tomorrow


import collections


class MyStack:

    def __init__(self):
        self.queue = collections.deque()

    def push(self, x: int) -> None:
        self.queue.append(x)

    def pop(self) -> int:
        new_queue = collections.deque()

        item = self.queue.popleft()

        while len(self.queue) > 0:
            new_queue.append(item)
            item = self.queue.popleft()

        self.queue = new_queue
        return item

    def top(self) -> int:
        return self.queue[-1]

    def empty(self) -> bool:
        return len(self.queue) == 0
