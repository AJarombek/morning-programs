/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 6/15/2023
 */

package _go

import "testing"

func TestIsSubsequencePresent(test *testing.T) {
	s := "abc"
	t := "ahbgdc"
	expected := true

	result := isSubsequence(s, t)

	if result != expected {
		test.Errorf("Expected %t, but got %t", expected, result)
	}
}

func TestIsSubsequenceNotPresent(test *testing.T) {
	s := "axc"
	t := "ahbgdc"
	expected := false

	result := isSubsequence(s, t)

	if result != expected {
		test.Errorf("Expected %t, but got %t", expected, result)
	}
}
