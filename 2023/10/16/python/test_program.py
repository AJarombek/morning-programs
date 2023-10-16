"""
Unit tests for the gas-station program.
Author: Andrew Jarombek
Date: 10/16/2023
"""

from program import Solution


def test_gas_station():
    result = Solution.can_complete_circuit([1, 2, 3, 4, 5], [3, 4, 5, 1, 2])
    assert result == 3
