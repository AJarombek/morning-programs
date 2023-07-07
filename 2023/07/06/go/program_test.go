/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/6/2023
 */

package _go

import (
	"testing"
)

func TestFindWords(t *testing.T) {
	words1 := []string{"hello", "alaska", "dad", "peace"}
	expected1 := []string{"alaska", "dad"}
	output1 := findWords(words1)
	if !equalSlices(output1, expected1) {
		t.Errorf("Test case 1 failed: expected '%v', got '%v'", expected1, output1)
	}

	words2 := []string{"adsdf", "sfd"}
	expected2 := []string{"adsdf", "sfd"}
	output2 := findWords(words2)
	if !equalSlices(output2, expected2) {
		t.Errorf("Test case 2 failed: expected '%v', got '%v'", expected2, output2)
	}
}

// Helper function to check if two string slices are equal
func equalSlices(a, b []string) bool {
	if len(a) != len(b) {
		return false
	}
	for i := range a {
		if a[i] != b[i] {
			return false
		}
	}
	return true
}
