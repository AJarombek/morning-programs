/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 2/12/2023
 */

package _go

import "testing"

func TestReverseVowelsString(t *testing.T) {
	nums1 := []int{1, 2, 2, 1}
	nums2 := []int{2, 2}
	result := intersection(nums1, nums2)

	if len(result) != 1 {
		t.Errorf(`len(intersection(nums1, nums2)) != 1`)
	}

	if result[0] != 2 {
		t.Errorf(`intersection(nums1, nums2)[0] != 2`)
	}
}
