/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/11/2023
 */

package _go

import "testing"

func TestIsOneBitCharacter(t *testing.T) {
	tests := []struct {
		bits     []int
		expected bool
	}{
		{[]int{1, 0, 0}, true},
		{[]int{1, 1, 1, 0}, false},
	}

	for _, test := range tests {
		result := isOneBitCharacter(test.bits)
		if result != test.expected {
			t.Errorf("For input %v, expected %t, but got %t", test.bits, test.expected, result)
		}
	}
}
