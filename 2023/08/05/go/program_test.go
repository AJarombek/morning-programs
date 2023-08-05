/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/5/2023
 */

package _go

import "testing"

func TestFindLengthOfLCIS(t *testing.T) {
	// Test Case 1: Test a non-empty increasing sequence
	nums1 := []int{1, 3, 5, 7, 8, 9}
	expected1 := 6

	result1 := findLengthOfLCIS(nums1)
	if result1 != expected1 {
		t.Errorf("Test case 1 failed: Expected %v, got %v", expected1, result1)
	}

	// Test Case 2: Test a non-empty sequence with repeated elements
	nums2 := []int{2, 2, 2, 3, 4, 5, 5, 6, 7}
	expected2 := 4

	result2 := findLengthOfLCIS(nums2)
	if result2 != expected2 {
		t.Errorf("Test case 2 failed: Expected %v, got %v", expected2, result2)
	}
}
