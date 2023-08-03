/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/2/2023
 */

package _go

import (
	"testing"
)

func TestJudgeCircle(t *testing.T) {
	// Test Case 1: Test for a valid circle path
	moves1 := "UDLRUDLR"
	expected1 := true

	result1 := judgeCircle(moves1)
	if result1 != expected1 {
		t.Errorf("Test case 1 failed: Expected %v, got %v", expected1, result1)
	}

	// Test Case 2: Test for a non-circle path
	moves2 := "UDLRU"
	expected2 := false

	result2 := judgeCircle(moves2)
	if result2 != expected2 {
		t.Errorf("Test case 2 failed: Expected %v, got %v", expected2, result2)
	}
}
