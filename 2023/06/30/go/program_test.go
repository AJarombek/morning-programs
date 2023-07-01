/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 6/30/2023
 */

package _go

import (
	"testing"
)

func TestFindComplement(t *testing.T) {
	num1 := 5
	expected1 := 2
	result1 := findComplement(num1)
	if result1 != expected1 {
		t.Errorf("Test 1: Expected %d, but got %d", expected1, result1)
	}

	num2 := 10
	expected2 := 5
	result2 := findComplement(num2)
	if result2 != expected2 {
		t.Errorf("Test 2: Expected %d, but got %d", expected2, result2)
	}
}
