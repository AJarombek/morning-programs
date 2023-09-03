/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 9/3/2023
 */

package _go

import (
	"reflect"
	"testing"
)

func TestNumberOfLines(t *testing.T) {
	// Test case 1: Basic test with a single line
	widths := []int{6, 5, 7, 4, 4, 5, 6, 7, 4, 5, 6, 7, 6, 5, 4, 5, 6, 7, 4, 4, 5, 6, 7, 4, 5, 6}
	s := "hello"
	expected := []int{1, 29}
	result := numberOfLines(widths, s)
	if !reflect.DeepEqual(result, expected) {
		t.Errorf("Expected %v, but got %v", expected, result)
	}

	// Test case 2: Test with multiple lines
	widths = []int{6, 5, 7, 4, 4, 5, 6, 7, 4, 5, 6, 7, 6, 5, 4, 5, 6, 7, 4, 4, 5, 6, 7, 4, 5, 6}
	s = "helloworld"
	expected = []int{1, 58}
	result = numberOfLines(widths, s)
	if !reflect.DeepEqual(result, expected) {
		t.Errorf("Expected %v, but got %v", expected, result)
	}
}
