/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 6/18/2023
 */

package _go

import "testing"

func TestLongestPalindrome(t *testing.T) {
	// Test case 1: Input string "abccccdd" has a longest palindrome "dccaccd" with length 7
	input1 := "abccccdd"
	expected1 := 7
	result1 := longestPalindrome(input1)
	if result1 != expected1 {
		t.Errorf("Test case 1 failed: Expected %d, but got %d", expected1, result1)
	}

	// Test case 2: Input string "aabb" has a longest palindrome "abba" with length 4
	input2 := "aabb"
	expected2 := 4
	result2 := longestPalindrome(input2)
	if result2 != expected2 {
		t.Errorf("Test case 2 failed: Expected %d, but got %d", expected2, result2)
	}
}
