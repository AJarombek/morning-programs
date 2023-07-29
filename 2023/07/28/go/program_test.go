/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/28/2023
 */

package _go

import (
	"testing"
)

func TestMaximumProduct(t *testing.T) {
	// Test case 1: Input contains all positive numbers.
	nums1 := []int{1, 2, 3, 4, 5}
	expectedResult1 := 60 // Product of 4 * 5 * 3
	result1 := maximumProduct(nums1)
	if result1 != expectedResult1 {
		t.Errorf("Test case 1 failed. Expected %d, but got %d", expectedResult1, result1)
	}

	// Test case 2: Input contains negative numbers.
	nums2 := []int{-10, -2, -5, -1, 3}
	expectedResult2 := 150 // Product of -10 * -5 * 3
	result2 := maximumProduct(nums2)
	if result2 != expectedResult2 {
		t.Errorf("Test case 2 failed. Expected %d, but got %d", expectedResult2, result2)
	}
}
