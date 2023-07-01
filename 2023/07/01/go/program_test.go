/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/1/2023
 */

package _go

import (
	"testing"
)

func TestLicenseKeyFormatting(t *testing.T) {
	// Test case 1: Normal case with dashes and lowercase letters
	input1 := "2-5g-3-J"
	k1 := 2
	expected1 := "2-5G-3J"
	output1 := licenseKeyFormatting(input1, k1)
	if output1 != expected1 {
		t.Errorf("Test case 1 failed: expected '%s', got '%s'", expected1, output1)
	}

	// Test case 2: Edge case with no dashes and uppercase letters
	input2 := "ABCDEF"
	k2 := 3
	expected2 := "ABC-DEF"
	output2 := licenseKeyFormatting(input2, k2)
	if output2 != expected2 {
		t.Errorf("Test case 2 failed: expected '%s', got '%s'", expected2, output2)
	}
}
