/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/31/2023
 */

package _go

import (
	"reflect"
	"testing"
)

func TestFindErrorNums(t *testing.T) {
	// Test case 1: nums = [1, 2, 2, 4]
	nums1 := []int{1, 2, 2, 4}
	expected1 := []int{2, 3}
	result1 := findErrorNums(nums1)
	if !reflect.DeepEqual(result1, expected1) {
		t.Errorf("Test case 1 failed. Expected: %v, Got: %v", expected1, result1)
	}

	// Test case 2: nums = [3, 2, 3, 4, 6, 5]
	nums2 := []int{3, 2, 3, 4, 6, 5}
	expected2 := []int{3, 1}
	result2 := findErrorNums(nums2)
	if !reflect.DeepEqual(result2, expected2) {
		t.Errorf("Test case 2 failed. Expected: %v, Got: %v", expected2, result2)
	}
}
