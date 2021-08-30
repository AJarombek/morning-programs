"""
https://leetcode.com/problems/add-strings/
Author: Andrew Jarombek
Date: 8/30/2021
"""


def add_strings(num1: str, num2: str) -> str:
    result = ""
    carry = 0

    for i in range(max(len(num1), len(num2))):
        first = int(num1[-1 - i]) if i < len(num1) else 0
        second = int(num2[-1 - i]) if i < len(num2) else 0
        val = first + second + carry

        carry = val // 10
        result = f"{val % 10}{result}"

    if carry == 1 and len(result) > 0:
        result = f"{carry}{result}"

    return result


if __name__ == '__main__':
    assert add_strings("9", "1") == "10"
