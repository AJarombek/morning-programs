/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/9/2023
 */

package _go

import "testing"

func TestCountBinarySubstrings(t *testing.T) {
	tests := []struct {
		input    string
		expected int
	}{
		{"00110011", 6},
		{"10101", 4},
	}

	for _, test := range tests {
		result := countBinarySubstrings(test.input)
		if result != test.expected {
			t.Errorf("For input %s, expected %d, but got %d", test.input, test.expected, result)
		}
	}
}
