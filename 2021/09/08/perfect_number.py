"""
https://leetcode.com/problems/perfect-number/
Author: Andrew Jarombek
Date: 9/8/2021
"""


def check_perfect_number(num: int) -> bool:
    if num == 1:
        return False

    result = 1
    current = 2
    end = num // 2

    while current < end:
        if num % current == 0:
            result += current

            new_end = num // current
            result += new_end
            end = new_end

        current += 1

    return result == num


if __name__ == '__main__':
    assert check_perfect_number(28)
