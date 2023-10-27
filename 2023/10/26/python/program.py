"""
https://leetcode.com/problems/evaluate-reverse-polish-notation/
Author: Andrew Jarombek
Date: 10/26/2023
"""

import math


class Solution:
    @staticmethod
    def eval_rpn(tokens: list[str]) -> int:
        index = 0
        operators = {"+", "-", "*", "/"}

        while len(tokens) > 1:
            value = tokens[index]

            if value in operators:
                result = ""
                print(f"{tokens[index-2]} {tokens[index]} {tokens[index-1]}")

                match value:
                    case "+":
                        result = str(int(tokens[index - 2]) + int(tokens[index - 1]))
                    case "-":
                        result = str(int(tokens[index - 2]) - int(tokens[index - 1]))
                    case "*":
                        result = str(int(tokens[index - 2]) * int(tokens[index - 1]))
                    case "/":
                        div_result = int(tokens[index - 2]) / int(tokens[index - 1])

                        if div_result >= 0:
                            result = str(math.floor(div_result))
                        else:
                            result = str(math.ceil(div_result))

                tokens = tokens[:index - 2] + [result] + tokens[index + 1:]
                index -= 2

            else:
                index += 1

        return int(tokens[0])
