/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/17/2023
 */

package _go

import (
	"testing"
)

func TestDominantIndex(t *testing.T) {
	tests := []struct {
		nums     []int
		expected int
	}{
		{[]int{3, 6, 1, 0}, 1},
		{[]int{1, 2, 3, 4}, -1},
		{[]int{0, 0, 0, 1}, 3},
		{[]int{1, 0}, 0},
		{[]int{2, 2, 2, 3}, -1},
	}

	for _, test := range tests {
		actual := dominantIndex(test.nums)
		if actual != test.expected {
			t.Errorf("For nums %v, expected %d, but got %d", test.nums, test.expected, actual)
		}
	}
}
