/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/13/2023
 */

package _go

import "testing"

func TestSelfDividingNumbers(t *testing.T) {
	tests := []struct {
		left     int
		right    int
		expected []int
	}{
		{1, 22, []int{1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22}},
		{10, 50, []int{11, 12, 15, 22, 24, 33, 36, 44, 48}},
	}

	for _, test := range tests {
		result := selfDividingNumbers(test.left, test.right)
		if !intSliceEqual(result, test.expected) {
			t.Errorf("For range [%d, %d], expected %v, but got %v", test.left, test.right, test.expected, result)
		}
	}
}

func intSliceEqual(a, b []int) bool {
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
