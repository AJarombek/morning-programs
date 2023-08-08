/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/7/2023
 */

package _go

import "testing"

func TestCalPoints(t *testing.T) {
	tests := []struct {
		operations []string
		expected   int
	}{
		{[]string{"5", "2", "C", "D", "+"}, 30},
		{[]string{"5", "-2", "4", "C", "D", "9", "+", "+"}, 27},
	}

	for _, test := range tests {
		result := calPoints(test.operations)
		if result != test.expected {
			t.Errorf("For operations %v, expected %d, but got %d", test.operations, test.expected, result)
		}
	}
}
