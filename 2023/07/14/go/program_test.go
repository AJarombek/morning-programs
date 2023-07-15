/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/14/2023
 */

package _go

import (
	"testing"
)

func TestCheckRecord(t *testing.T) {
	// Test case 1: No more than one 'A' and no more than two consecutive 'L'
	input1 := "PPALLP"
	expected1 := true
	result1 := checkRecord(input1)
	if result1 != expected1 {
		t.Errorf("Test case 1 failed: expected %v, got %v", expected1, result1)
	}

	// Test case 2: More than one 'A'
	input2 := "PPAALL"
	expected2 := false
	result2 := checkRecord(input2)
	if result2 != expected2 {
		t.Errorf("Test case 2 failed: expected %v, got %v", expected2, result2)
	}
}
