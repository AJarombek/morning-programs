"""
https://leetcode.com/problems/goal-parser-interpretation/
Author: Andrew Jarombek
Date: 8/25/2022
"""


def interpret(command: str) -> str:
    result = []
    index = 0

    while index < len(command):
        if command[index] == 'G':
            result.append('G')
            index += 1
        elif command[index + 1] == ')':
            result.append('o')
            index += 2
        else:
            result.append('al')
            index += 4

    return "".join(result)


if __name__ == '__main__':
    assert interpret("G()(al)") == "Goal"
