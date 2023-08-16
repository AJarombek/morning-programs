/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/15/2023
 */

package _go

import (
	"testing"
)

func TestNextGreatestLetter(t *testing.T) {
	// Test case 1: Regular case with target in the middle
	letters1 := []byte{'c', 'f', 'j', 'p', 'z'}
	target1 := byte('d')
	expected1 := byte('f')
	result1 := nextGreatestLetter(letters1, target1)
	if result1 != expected1 {
		t.Errorf("Expected %c, but got %c", expected1, result1)
	}

	// Test case 2: Wrap-around case where target is the greatest letter
	letters2 := []byte{'a', 'a', 'b', 'b', 'c', 'c'}
	target2 := byte('d')
	expected2 := byte('a')
	result2 := nextGreatestLetter(letters2, target2)
	if result2 != expected2 {
		t.Errorf("Expected %c, but got %c", expected2, result2)
	}
}
