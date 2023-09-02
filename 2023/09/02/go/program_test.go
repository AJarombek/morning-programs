/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 9/2/2023
 */

package _go

import "testing"

func TestUniqueMorseRepresentations(t *testing.T) {
	// Test case 1: Unique Morse representations
	words1 := []string{"gin", "zen", "gig", "msg"}
	expected1 := 2
	result1 := uniqueMorseRepresentations(words1)
	if result1 != expected1 {
		t.Errorf("Expected %d unique Morse representations, but got %d", expected1, result1)
	}

	// Test case 2: All words are unique
	words2 := []string{"hello", "world", "leetcode"}
	expected2 := 3
	result2 := uniqueMorseRepresentations(words2)
	if result2 != expected2 {
		t.Errorf("Expected %d unique Morse representations, but got %d", expected2, result2)
	}
}
