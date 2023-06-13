/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 6/12/2023
 */

package _go

import "testing"

func TestCanConstruct(t *testing.T) {
	// Test case 1: Valid construction
	ransomNote1 := "aabb"
	magazine1 := "bbaaac"
	expected1 := true
	result1 := canConstruct(ransomNote1, magazine1)
	if result1 != expected1 {
		t.Errorf("canConstruct(%q, %q) = %t; expected %t", ransomNote1, magazine1, result1, expected1)
	}

	// Test case 2: Invalid construction
	ransomNote2 := "abc"
	magazine2 := "defgh"
	expected2 := false
	result2 := canConstruct(ransomNote2, magazine2)
	if result2 != expected2 {
		t.Errorf("canConstruct(%q, %q) = %t; expected %t", ransomNote2, magazine2, result2, expected2)
	}
}
