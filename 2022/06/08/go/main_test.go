/**
 * https://leetcode.com/problems/symmetric-tree/
 * Author: Andrew Jarombek
 * Date: 6/8/2022
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

func isSymmetric(root *TreeNode) bool {
	return checkEqual(root.Left, root.Right)
}

func checkEqual(node1 *TreeNode, node2 *TreeNode) bool {
	if node1 == nil && node2 == nil {
		return true
	}

	if node1 == nil || node2 == nil || node1.Val != node2.Val {
		return false
	}

	left := checkEqual(node1.Left, node2.Right)
	right := checkEqual(node1.Right, node2.Left)
	return left && right
}

func TestIsSymmetric(t *testing.T) {
	node3 := TreeNode{3, nil, nil}
	node2 := TreeNode{2, &node3, nil}
	tree := TreeNode{Val: 1, Left: nil, Right: &node2}

	assert.False(t, isSymmetric(&tree))
}