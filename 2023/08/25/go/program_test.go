/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/25/2023
 */

package _go

import (
	"testing"
)

func TestSearch(t *testing.T) {
	tests := []struct {
		nums     []int
		target   int
		expected int
	}{
		{
			nums:     []int{-1, 0, 3, 5, 9, 12},
			target:   9,
			expected: 4,
		},
		{
			nums:     []int{-1, 0, 3, 5, 9, 12},
			target:   2,
			expected: -1,
		},
	}

	for _, test := range tests {
		result := search(test.nums, test.target)
		if result != test.expected {
			t.Errorf("For target %d, expected %d but got %d", test.target, test.expected, result)
		}
	}
}
