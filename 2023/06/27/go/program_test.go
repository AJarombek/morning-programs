/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 6/27/2023
 */

package _go

import (
	"testing"
)

func TestRepeatedSubstringPattern(t *testing.T) {
	// Test case 1: "abab" should return true
	s := "abab"
	expected := true
	result := repeatedSubstringPattern(s)
	if result != expected {
		t.Errorf("Test case 1 failed: Expected %v, but got %v", expected, result)
	}

	// Test case 2: "abcabcabc" should return true
	s = "abcabcabc"
	expected = true
	result = repeatedSubstringPattern(s)
	if result != expected {
		t.Errorf("Test case 2 failed: Expected %v, but got %v", expected, result)
	}
}
