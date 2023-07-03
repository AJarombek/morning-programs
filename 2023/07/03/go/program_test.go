/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/3/2023
 */

package _go

import (
	"testing"
)

func TestConstructRectangle(t *testing.T) {
	// Test case 1: Normal case with area = 36
	area1 := 36
	expected1 := []int{6, 6}
	output1 := constructRectangle(area1)
	if !equalSlices(output1, expected1) {
		t.Errorf("Test case 1 failed: expected '%v', got '%v'", expected1, output1)
	}

	// Test case 2: Edge case with prime number area = 17
	area2 := 17
	expected2 := []int{17, 1}
	output2 := constructRectangle(area2)
	if !equalSlices(output2, expected2) {
		t.Errorf("Test case 2 failed: expected '%v', got '%v'", expected2, output2)
	}
}

// Helper function to check if two integer slices are equal
func equalSlices(a, b []int) bool {
	if len(a) != len(b) {
		return false
	}
	for i := range a {
		if a[i] != b[i] {
			return false
		}
	}
	return true
}
