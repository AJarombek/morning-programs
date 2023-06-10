/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 6/10/2023
 */

package _go

import (
	"reflect"
	"testing"
)

func TestIntersect(t *testing.T) {
	nums1 := []int{1, 2, 2, 1}
	nums2 := []int{2, 2}
	expected := []int{2, 2}

	result := intersect(nums1, nums2)

	if !reflect.DeepEqual(result, expected) {
		t.Errorf("intersect(%v, %v) = %v; expected %v", nums1, nums2, result, expected)
	}
}
