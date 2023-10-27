"""
Unit tests for the evaluate-reverse-polish-notation program.
Author: Andrew Jarombek
Date: 10/26/2023
"""

from program import Solution


def test_eval_rpn():
    assert Solution.eval_rpn(["2", "1", "+", "3", "*"]) == 9
    assert Solution.eval_rpn(["2", "3", "+"]) == 5
