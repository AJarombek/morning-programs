"""
https://leetcode.com/problems/multiply-strings/
Author: Andrew Jarombek
Date: 3/7/2022
"""


class Solution:
    def multiply(self, num1: str, num2: str) -> str:
        if num1 == "0" or num2 == "0":
            return "0"

        total = None
        current = ""

        i = len(num1) - 1
        it = 0

        while i >= 0:
            x = int(num1[i])
            r = 0

            j = len(num2) - 1

            while j >= 0:
                y = int(num2[j])

                val = x * y + r
                current = f"{val % 10}{current}"
                r = val // 10
                j -= 1

            if r > 0:
                current = f"{r}{current}"

            if total is None:
                total = current
            else:
                total = self.add(current, total)

            it += 1
            current = "0" * it
            i -= 1

        return total

    def add(self, num1: str, num2: str) -> str:
        result = ""

        i = len(num1) - 1
        j = len(num2) - 1
        r = 0

        while i >= 0 or j >= 0:
            x = int(num1[i]) if i >= 0 else 0
            y = int(num2[j]) if j >= 0 else 0
            val = x + y + r

            result = f"{val % 10}{result}"
            r = val // 10

            i -= 1
            j -= 1

        if r > 0:
            return f"1{result}"

        return result
