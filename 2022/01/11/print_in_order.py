"""
https://leetcode.com/problems/print-in-order/
Author: Andrew Jarombek
Date: 1/11/2022
"""

import threading
from typing import Callable


class PrintInOrder:
    def __init__(self):
        self.lock = threading.Lock()
        self.value = 0

    def first(self, print_first: Callable[[], None]) -> None:
        with self.lock:
            if self.value != 0:
                return

        print_first()

        with self.lock:
            self.value += 1

    def second(self, print_second: Callable[[], None]) -> None:
        while True:
            with self.lock:
                if self.value == 1:
                    break

        print_second()

        with self.lock:
            self.value += 1

    def third(self, print_third: Callable[[], None]) -> None:
        while True:
            with self.lock:
                if self.value == 2:
                    break

        print_third()

        with self.lock:
            self.value += 1
