/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/27/2023
 */

package _go

import (
	"fmt"
	"testing"
)

func TestRotateString(t *testing.T) {
	testCases := []struct {
		s, goal  string
		expected bool
	}{
		{"abcde", "cdeab", true},
		{"abcde", "abced", false},
		{"", "", true},
	}

	for _, tc := range testCases {
		t.Run(fmt.Sprintf("%s_%s", tc.s, tc.goal), func(t *testing.T) {
			result := rotateString(tc.s, tc.goal)
			if result != tc.expected {
				t.Errorf("Expected %v, but got %v", tc.expected, result)
			}
		})
	}
}
