/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/8/2023
 */

package _go

import "testing"

func TestHasAlternatingBits(t *testing.T) {
	tests := []struct {
		num      int
		expected bool
	}{
		{5, true},
		{7, false},
	}

	for _, test := range tests {
		result := hasAlternatingBits(test.num)
		if result != test.expected {
			t.Errorf("For input %d, expected %v, but got %v", test.num, test.expected, result)
		}
	}
}
