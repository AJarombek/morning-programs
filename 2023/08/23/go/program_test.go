/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/23/2023
 */

package _go

import (
	"testing"
)

func TestNumJewelsInStones(t *testing.T) {
	tests := []struct {
		jewels   string
		stones   string
		expected int
	}{
		{
			jewels:   "aA",
			stones:   "aAAbbbb",
			expected: 3,
		},
		{
			jewels:   "z",
			stones:   "ZZ",
			expected: 0,
		},
	}

	for _, test := range tests {
		result := numJewelsInStones(test.jewels, test.stones)
		if result != test.expected {
			t.Errorf("For jewels '%s' and stones '%s', expected %d but got %d", test.jewels, test.stones, test.expected, result)
		}
	}
}
