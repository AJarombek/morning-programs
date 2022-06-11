/**
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 * Author: Andrew Jarombek
 * Date: 6/11/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"math"
	"testing"
)

type TreeNode struct {
    Val int
    Left *TreeNode
    Right *TreeNode
}

type Result struct {
	Balanced bool
	Depth int
}

func isBalanced(root *TreeNode) bool {
	if root == nil {
		return true
	}

	result := dfs(root)
	return result.Balanced
}

func dfs(node *TreeNode) Result {
	left := Result{Balanced: true}
	right := Result{Balanced: true}

	if node.Left != nil {
		left = dfs(node.Left)
	}

	if node.Right != nil {
		right = dfs(node.Right)
	}

	return Result{
		Balanced: math.Abs(float64(left.Depth - right.Depth)) < 2 && left.Balanced && right.Balanced,
		Depth: int(math.Max(float64(left.Depth), float64(right.Depth))) + 1,
	}
}

func TestIsBalanced(t *testing.T) {
	node3 := TreeNode{3, nil, nil}
	node2 := TreeNode{2, &node3, nil}
	tree := TreeNode{Val: 1, Left: nil, Right: &node2}

	assert.False(t, isBalanced(&tree))

	node3 = TreeNode{3, nil, nil}
	node2 = TreeNode{2, nil, nil}
	tree = TreeNode{Val: 1, Left: &node3, Right: &node2}

	assert.True(t, isBalanced(&tree))
}