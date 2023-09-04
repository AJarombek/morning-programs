/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 9/4/2023
 */

package _go

import (
	"math"
	"testing"
)

func TestLargestTriangleArea(t *testing.T) {
	tests := []struct {
		points   [][]int
		expected float64
	}{
		{
			points:   [][]int{{0, 0}, {0, 1}, {1, 0}},
			expected: 0.5,
		},
		{
			points:   [][]int{{-1, -1}, {1, 0}, {0, 1}},
			expected: 1.5,
		},
	}

	for _, test := range tests {
		t.Run("", func(t *testing.T) {
			result := largestTriangleArea(test.points)
			if math.Abs(result-test.expected) > 1e-9 {
				t.Errorf("Expected %v, but got %v", test.expected, result)
			}
		})
	}
}
