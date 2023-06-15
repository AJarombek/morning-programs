/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 6/14/2023
 */

package _go

import "testing"

func TestFindTheDifference1(test *testing.T) {
	s := "abcd"
	t := "abcde"
	expected := byte('e')

	result := findTheDifference(s, t)
	if result != expected {
		test.Errorf("Expected %c, but got %c", expected, result)
	}
}

func TestFindTheDifference2(test *testing.T) {
	s := "hello"
	t := "hleloo"
	expected := byte('o')

	result := findTheDifference(s, t)
	if result != expected {
		test.Errorf("Expected %c, but got %c", expected, result)
	}
}
