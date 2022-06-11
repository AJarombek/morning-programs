/**
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 * Author: Andrew Jarombek
 * Date: 6/10/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

type TreeNode struct {
    Val int
    Left *TreeNode
    Right *TreeNode
}

func sortedArrayToBST(nums []int) *TreeNode {
	mid := len(nums) / 2
	node := TreeNode{Val: nums[mid]}

	if mid > 0 {
		node.Left = sortedArrayToBST(nums[:mid])
	}

	if mid + 1 < len(nums) {
		node.Right = sortedArrayToBST(nums[mid + 1:])
	}

	return &node
}

func TestSortedArrayToBST(t *testing.T) {
	nums := []int {1, 2, 3}
	root := sortedArrayToBST(nums)

	assert.Equal(t, 2, root.Val)
	assert.Equal(t, 1, root.Left.Val)
	assert.Equal(t, 3, root.Right.Val)
}