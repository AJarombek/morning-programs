"""
https://leetcode.com/problems/lru-cache/
Author: Andrew Jarombek
Date: 10/23/2023
"""


class LRUCache:

    def __init__(self, capacity: int):
        self.capacity = capacity
        self.values = {}

    def get(self, key: int) -> int:
        if key not in self.values:
            return -1

        value = self.values.pop(key)
        self.values[key] = value

        return value

    def put(self, key: int, value: int) -> None:
        if key in self.values:
            self.values.pop(key)

        self.values[key] = value

        if len(self.values) > self.capacity:
            self.values.pop(next(iter(self.values)))
