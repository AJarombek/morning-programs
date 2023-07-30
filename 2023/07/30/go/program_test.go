/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/30/2023
 */

package _go

import (
	"math"
	"testing"
)

func TestFindMaxAverage(t *testing.T) {
	// Test case 1: nums = [1, 12, -5, -6, 50, 3], k = 4
	nums1 := []int{1, 12, -5, -6, 50, 3}
	k1 := 4
	expected1 := 12.75
	result1 := findMaxAverage(nums1, k1)
	if math.Abs(result1-expected1) > 1e-6 {
		t.Errorf("Test case 1 failed. Expected: %v, Got: %v", expected1, result1)
	}

	// Test case 2: nums = [1, 2, 3, 4, 5], k = 3
	nums2 := []int{1, 2, 3, 4, 5}
	k2 := 3
	expected2 := 4.0
	result2 := findMaxAverage(nums2, k2)
	if math.Abs(result2-expected2) > 1e-6 {
		t.Errorf("Test case 2 failed. Expected: %v, Got: %v", expected2, result2)
	}
}
