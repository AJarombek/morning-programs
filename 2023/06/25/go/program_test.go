/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 6/25/2023
 */

package _go

import (
	"reflect"
	"testing"
)

func TestFindDisappearedNumbers(t *testing.T) {
	nums := []int{4, 3, 2, 7, 8, 2, 3, 1}
	expected := []int{5, 6}
	result := findDisappearedNumbers(nums)
	if !reflect.DeepEqual(result, expected) {
		t.Errorf("Test case 1 failed: Expected %v, but got %v", expected, result)
	}

	nums = []int{1, 1, 2, 2}
	expected = []int{3, 4}
	result = findDisappearedNumbers(nums)
	if !reflect.DeepEqual(result, expected) {
		t.Errorf("Test case 2 failed: Expected %v, but got %v", expected, result)
	}
}
