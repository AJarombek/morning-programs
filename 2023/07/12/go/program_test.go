/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/12/2023
 */

package _go

import (
	"testing"
)

func TestReverseStr(t *testing.T) {
	// Test case 1
	s1 := "abcdefg"
	k1 := 2
	expected1 := "bacdfeg"
	result1 := reverseStr(s1, k1)
	if result1 != expected1 {
		t.Errorf("Test case 1 failed: expected %q, got %q", expected1, result1)
	}

	// Test case 2
	s2 := "abcdefgh"
	k2 := 3
	expected2 := "cbadefhg"
	result2 := reverseStr(s2, k2)
	if result2 != expected2 {
		t.Errorf("Test case 2 failed: expected %q, got %q", expected2, result2)
	}
}
