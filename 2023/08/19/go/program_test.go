/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/19/2023
 */

package _go

import (
	"testing"
)

func TestCountPrimeSetBits(t *testing.T) {
	tests := []struct {
		left     int
		right    int
		expected int
	}{
		{6, 10, 4},
		{5, 5, 1},
	}

	for _, test := range tests {
		result := countPrimeSetBits(test.left, test.right)
		if result != test.expected {
			t.Errorf("For left=%d, right=%d, expected %d, but got %d", test.left, test.right, test.expected, result)
		}
	}
}
