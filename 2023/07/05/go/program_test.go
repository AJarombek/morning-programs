/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/5/2023
 */

package _go

import (
	"reflect"
	"testing"
)

func TestNextGreaterElement(t *testing.T) {
	// Test case 1
	nums1 := []int{4, 1, 2}
	nums2 := []int{1, 3, 4, 2}

	expected := []int{-1, 3, -1}
	result := nextGreaterElement(nums1, nums2)

	if !reflect.DeepEqual(result, expected) {
		t.Errorf("Test case 1 failed: expected %v, got %v", expected, result)
	}

	// Test case 2
	nums1 = []int{2, 4}
	nums2 = []int{1, 2, 3, 4}

	expected = []int{3, -1}
	result = nextGreaterElement(nums1, nums2)

	if !reflect.DeepEqual(result, expected) {
		t.Errorf("Test case 2 failed: expected %v, got %v", expected, result)
	}
}
