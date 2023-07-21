/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/21/2023
 */

package _go

import (
	"testing"
)

func TestFindLHS(t *testing.T) {
	// Test case 1: Regular input with a valid longest harmonious subsequence
	input1 := []int{1, 3, 2, 2, 5, 2, 3, 7}
	expected1 := 5
	result1 := findLHS(input1)
	if result1 != expected1 {
		t.Errorf("Test case 1 failed. Expected: %d, Got: %d", expected1, result1)
	}

	// Test case 2: Regular input with no valid longest harmonious subsequence
	input2 := []int{1, 2, 3, 4}
	expected2 := 2
	result2 := findLHS(input2)
	if result2 != expected2 {
		t.Errorf("Test case 2 failed. Expected: %d, Got: %d", expected2, result2)
	}
}
