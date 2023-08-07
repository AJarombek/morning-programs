/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/6/2023
 */

package _go

import "testing"

func TestValidPalindrome(t *testing.T) {
	// Test Case 1: Test a valid palindrome
	input1 := "racecar"
	expected1 := true

	result1 := validPalindrome(input1)
	if result1 != expected1 {
		t.Errorf("Test case 1 failed: Expected %v, got %v", expected1, result1)
	}

	// Test Case 2: Test a non-palindrome string
	input2 := "hello"
	expected2 := false

	result2 := validPalindrome(input2)
	if result2 != expected2 {
		t.Errorf("Test case 2 failed: Expected %v, got %v", expected2, result2)
	}
}
