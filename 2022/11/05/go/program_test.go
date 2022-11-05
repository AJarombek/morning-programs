/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 11/5/2022
 */

package _go

import "testing"

func TestContainsDuplicate(t *testing.T) {
	list1 := []int{1, 2, 3, 1}
	list2 := []int{1, 2, 3, 4}
	list3 := []int{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}

	if !containsDuplicate(list1) {
		t.Errorf(`containsDuplicate(list1) != true`)
	}

	if containsDuplicate(list2) {
		t.Errorf(`containsDuplicate(list2) != false`)
	}

	if !containsDuplicate(list3) {
		t.Errorf(`containsDuplicate(list3) != true`)
	}
}

func TestContainsNearbyDuplicate(t *testing.T) {
	list1 := []int{1, 2, 3, 1}
	list2 := []int{1, 0, 1, 1}
	list3 := []int{1, 2, 3, 1, 2, 3}

	if !containsNearbyDuplicate(list1, 3) {
		t.Errorf(`containsNearbyDuplicate(list1) != true`)
	}

	if !containsNearbyDuplicate(list2, 1) {
		t.Errorf(`containsNearbyDuplicate(list2) != true`)
	}

	if containsNearbyDuplicate(list3, 2) {
		t.Errorf(`containsNearbyDuplicate(list3) != false`)
	}
}
