/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 6/19/2023
 */

package _go

import "testing"

func TestFizzBuzz(t *testing.T) {
	// Test case 1: n = 15
	n1 := 15
	expected1 := []string{
		"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz",
	}
	result1 := fizzBuzz(n1)
	if !stringSliceEqual(result1, expected1) {
		t.Errorf("Test case 1 failed: Expected %v, but got %v", expected1, result1)
	}

	// Test case 2: n = 7
	n2 := 7
	expected2 := []string{
		"1", "2", "Fizz", "4", "Buzz", "Fizz", "7",
	}
	result2 := fizzBuzz(n2)
	if !stringSliceEqual(result2, expected2) {
		t.Errorf("Test case 2 failed: Expected %v, but got %v", expected2, result2)
	}
}

func stringSliceEqual(slice1, slice2 []string) bool {
	if len(slice1) != len(slice2) {
		return false
	}
	for i := range slice1 {
		if slice1[i] != slice2[i] {
			return false
		}
	}
	return true
}
