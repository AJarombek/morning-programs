/**
 * https://leetcode.com/problems/merge-sorted-array/
 * Author: Andrew Jarombek
 * Date: 5/7/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func merge(nums1 []int, m int, nums2 []int, n int)  {
	index := m + n - 1
	i := m - 1
	j := n - 1

	for j >= 0 {
		if i < 0 || nums2[j] >= nums1[i] {
			nums1[index] = nums2[j]
			j--
		} else {
			nums1[index] = nums1[i]
			i--
		}

		index--
	}
}

func TestDeleteDuplicates(t *testing.T) {
	slice1 := []int {1, 2, 3, 0, 0, 0}
	slice2 := []int {2, 5, 6}
	merge(slice1, 3, slice2, 3)

	assert.Equal(t, 1, slice1[0])
	assert.Equal(t, 2, slice1[1])
	assert.Equal(t, 2, slice1[2])
	assert.Equal(t, 3, slice1[3])
	assert.Equal(t, 5, slice1[4])
	assert.Equal(t, 6, slice1[5])
}