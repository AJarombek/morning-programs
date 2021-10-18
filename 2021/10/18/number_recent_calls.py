"""
https://leetcode.com/problems/number-of-recent-calls/
Author: Andrew Jarombek
Date: 10/18/2021
"""

import collections


class RecentCounter:

    def __init__(self):
        self.queue = collections.deque()

    def ping(self, t: int) -> int:
        self.queue.append(t)

        start = t - 3000
        while self.queue[0] < start:
            self.queue.popleft()

        return len(self.queue)
