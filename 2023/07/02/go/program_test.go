/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/2/2023
 */

package _go

import (
	"testing"
)

func TestFindMaxConsecutiveOnes(t *testing.T) {
	// Test case 1: Normal case with consecutive ones
	nums1 := []int{1, 1, 0, 1, 1, 1}
	expected1 := 3
	output1 := findMaxConsecutiveOnes(nums1)
	if output1 != expected1 {
		t.Errorf("Test case 1 failed: expected '%d', got '%d'", expected1, output1)
	}

	// Test case 2: Edge case with no consecutive ones
	nums2 := []int{0, 0, 0, 0, 0}
	expected2 := 0
	output2 := findMaxConsecutiveOnes(nums2)
	if output2 != expected2 {
		t.Errorf("Test case 2 failed: expected '%d', got '%d'", expected2, output2)
	}
}
