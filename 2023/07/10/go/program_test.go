/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/10/2023
 */

package _go

import (
	"testing"
)

func TestDetectCapitalUse(t *testing.T) {
	testCases := []struct {
		word     string
		expected bool
	}{
		{"GO", true},
		{"HelloWorld", false},
	}

	for _, testCase := range testCases {
		result := detectCapitalUse(testCase.word)
		if result != testCase.expected {
			t.Errorf("Test case failed: word=%s, expected=%v, got=%v", testCase.word, testCase.expected, result)
		}
	}
}
