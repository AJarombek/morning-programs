/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/3/2023
 */

package _go

import (
	"reflect"
	"testing"
)

func TestImageSmoother(t *testing.T) {
	// Test Case 1: Test a 3x3 image with valid smoothing
	input1 := [][]int{
		{1, 1, 1},
		{1, 0, 1},
		{1, 1, 1},
	}
	expected1 := [][]int{
		{0, 0, 0},
		{0, 0, 0},
		{0, 0, 0},
	}

	result1 := imageSmoother(input1)
	if !reflect.DeepEqual(result1, expected1) {
		t.Errorf("Test case 1 failed: Expected %v, got %v", expected1, result1)
	}

	// Test Case 2: Test a 2x2 image with only one pixel
	input2 := [][]int{
		{5, 10},
	}
	expected2 := [][]int{
		{7, 7},
	}

	result2 := imageSmoother(input2)
	if !reflect.DeepEqual(result2, expected2) {
		t.Errorf("Test case 2 failed: Expected %v, got %v", expected2, result2)
	}
}
