/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 9/5/2023
 */

package _go

import (
	"testing"
)

func TestMostCommonWord(t *testing.T) {
	paragraph := "This is a test. This is only a test."
	banned := []string{"is"}
	expected := "this"
	result := mostCommonWord(paragraph, banned)
	if result != expected {
		t.Errorf("Expected %s, but got %s", expected, result)
	}

	paragraph = "This is a test. This is only a test."
	banned = []string{"is", "a", "test"}
	expected = "this"
	result = mostCommonWord(paragraph, banned)
	if result != expected {
		t.Errorf("Expected %s, but got %s", expected, result)
	}
}
