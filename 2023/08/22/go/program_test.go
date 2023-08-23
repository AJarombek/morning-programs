/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/22/2023
 */

package _go

import (
	"testing"
)

func TestIsToeplitzMatrix(t *testing.T) {
	tests := []struct {
		matrix   [][]int
		expected bool
	}{
		{
			matrix: [][]int{
				{1, 2, 3, 4},
				{5, 1, 2, 3},
				{9, 5, 1, 2},
			},
			expected: true,
		},
		{
			matrix: [][]int{
				{1, 2, 3, 4},
				{5, 6, 2, 3},
				{9, 5, 8, 2},
			},
			expected: false,
		},
	}

	for _, test := range tests {
		result := isToeplitzMatrix(test.matrix)
		if result != test.expected {
			t.Errorf("For matrix %v, expected %v but got %v", test.matrix, test.expected, result)
		}
	}
}
