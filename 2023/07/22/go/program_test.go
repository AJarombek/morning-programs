/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/22/2023
 */

package _go

import (
	"testing"
)

func TestMaxCount(t *testing.T) {
	// Test case 1: Regular input with valid operations
	m1 := 3
	n1 := 4
	ops1 := [][]int{{2, 3}, {3, 1}}
	expected1 := 2
	result1 := maxCount(m1, n1, ops1)
	if result1 != expected1 {
		t.Errorf("Test case 1 failed. Expected: %d, Got: %d", expected1, result1)
	}

	// Test case 2: Regular input with no operations
	m2 := 5
	n2 := 6
	ops2 := [][]int{}
	expected2 := 5 * 6
	result2 := maxCount(m2, n2, ops2)
	if result2 != expected2 {
		t.Errorf("Test case 2 failed. Expected: %d, Got: %d", expected2, result2)
	}
}
