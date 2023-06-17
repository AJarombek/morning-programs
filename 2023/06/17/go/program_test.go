/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 6/17/2023
 */

package _go

import "testing"

func TestToHexPositiveNumber(t *testing.T) {
	num := 26
	expected := "1a"
	result := toHex(num)

	if result != expected {
		t.Errorf("Expected %s, but got %s", expected, result)
	}
}

func TestToHexNegativeNumber(t *testing.T) {
	num := -1
	expected := "ffffffff"
	result := toHex(num)

	if result != expected {
		t.Errorf("Expected %s, but got %s", expected, result)
	}
}
