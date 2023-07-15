/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/15/2023
 */

package _go

import (
	"testing"
)

func TestReverseWords(t *testing.T) {
	input1 := "Hello World"
	expected1 := "olleH dlroW"
	result1 := reverseWords(input1)
	if result1 != expected1 {
		t.Errorf("Test case 1 failed: expected '%s', got '%s'", expected1, result1)
	}

	input2 := "programming"
	expected2 := "gnimmargorp"
	result2 := reverseWords(input2)
	if result2 != expected2 {
		t.Errorf("Test case 2 failed: expected '%s', got '%s'", expected2, result2)
	}
}
