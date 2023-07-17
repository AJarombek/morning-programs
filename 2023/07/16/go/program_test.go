/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/16/2023
 */

package _go

import (
	"testing"
)

func TestArrayPartition(t *testing.T) {
	// Test case 1
	input1 := []int{1, 4, 3, 2}
	expected1 := 4
	result1 := arrayPairSum(input1)

	if expected1 != result1 {
		t.Errorf("Test case 1 failed: expected %v, got %v", expected1, result1)
	}

	// Test case 2
	input2 := []int{6, 2, 6, 5, 1, 2}
	expected2 := 9
	result2 := arrayPairSum(input2)

	if expected2 != result2 {
		t.Errorf("Test case 2 failed: expected %v, got %v", expected2, result2)
	}
}
