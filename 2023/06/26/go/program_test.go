/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 6/26/2023
 */

package _go

import (
	"testing"
)

func TestFindContentChildren(t *testing.T) {
	// Test case 1: g = [1, 2, 3], s = [1, 1]
	g := []int{1, 2, 3}
	s := []int{1, 1}
	expected := 1
	result := findContentChildren(g, s)
	if result != expected {
		t.Errorf("Test case 1 failed: Expected %d, but got %d", expected, result)
	}

	// Test case 2: g = [1, 2], s = [1, 2, 3]
	g = []int{1, 2}
	s = []int{1, 2, 3}
	expected = 2
	result = findContentChildren(g, s)
	if result != expected {
		t.Errorf("Test case 2 failed: Expected %d, but got %d", expected, result)
	}
}
