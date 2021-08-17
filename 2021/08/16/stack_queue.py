"""
Problem: https://leetcode.com/problems/implement-queue-using-stacks/
Author: Andrew Jarombek
Date: 8/16/2021
"""

from typing import Optional


class MyQueue:

    def __init__(self):
        self.stack = []

    def push(self, x: int) -> None:
        self.stack.append(x)

    def pop(self) -> Optional[int]:
        if len(self.stack) == 0:
            return None

        temp_stack = []

        while len(self.stack) > 1:
            temp_stack.append(self.stack.pop())

        item = self.stack.pop()

        while len(temp_stack) > 0:
            self.stack.append(temp_stack.pop())

        return item

    def peek(self) -> Optional[int]:
        if len(self.stack) == 0:
            return None

        temp_stack = []

        while len(self.stack) > 1:
            temp_stack.append(self.stack.pop())

        item = self.stack.pop()
        temp_stack.append(item)

        while len(temp_stack) > 0:
            self.stack.append(temp_stack.pop())

        return item

    def empty(self) -> bool:
        return len(self.stack) == 0
