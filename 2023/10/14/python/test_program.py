"""
Unit tests for the palindrome-partitioning program.
Author: Andrew Jarombek
Date: 10/14/2023
"""

import pytest
from program import Solution


@pytest.fixture
def expected_result():
    return [
        ['a', 'a', 'b'],
        ['aa', 'b']
    ]


def test_partition_empty():
    assert Solution.partition('') == []


def test_partition_single():
    assert Solution.partition('a') == [['a']]


def test_partition(expected_result):
    assert Solution.partition('aab') == expected_result

