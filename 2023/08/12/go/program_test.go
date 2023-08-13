/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/12/2023
 */

package _go

import "testing"

func TestPivotIndex(t *testing.T) {
	tests := []struct {
		nums     []int
		expected int
	}{
		{[]int{1, 7, 3, 6, 5, 6}, 3},
		{[]int{1, 2, 3}, -1},
	}

	for _, test := range tests {
		result := pivotIndex(test.nums)
		if result != test.expected {
			t.Errorf("For input %v, expected %d, but got %d", test.nums, test.expected, result)
		}
	}
}
