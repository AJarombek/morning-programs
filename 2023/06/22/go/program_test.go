/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 6/22/2023
 */

package _go

import "testing"

func TestThirdMax(t *testing.T) {
	// Test case 1: nums = [3, 2, 1]
	nums1 := []int{3, 2, 1}
	expected1 := 1
	result1 := thirdMax(nums1)
	if result1 != expected1 {
		t.Errorf("Test case 1 failed: Expected %v, but got %v", expected1, result1)
	}

	// Test case 2: nums = [1, 2]
	nums2 := []int{1, 2}
	expected2 := 2
	result2 := thirdMax(nums2)
	if result2 != expected2 {
		t.Errorf("Test case 2 failed: Expected %v, but got %v", expected2, result2)
	}
}
