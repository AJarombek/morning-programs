/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/10/2023
 */

package _go

import "testing"

func TestFindShortestSubArray(t *testing.T) {
	tests := []struct {
		nums     []int
		expected int
	}{
		{[]int{1, 2, 2, 3, 1}, 2},
		{[]int{1, 2, 2, 3, 1, 4, 2}, 6},
	}

	for _, test := range tests {
		result := findShortestSubArray(test.nums)
		if result != test.expected {
			t.Errorf("For input %v, expected %d, but got %d", test.nums, test.expected, result)
		}
	}
}
