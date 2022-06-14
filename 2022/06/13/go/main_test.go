/**
 * https://leetcode.com/problems/path-sum/
 * Author: Andrew Jarombek
 * Date: 6/13/2022
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

func hasPathSum(root *TreeNode, targetSum int) bool {
	if root == nil {
		return false
	}

	return dfs(root, targetSum, 0)
}

func dfs(root *TreeNode, targetSum int, currentSum int) bool {
	sum := currentSum + root.Val

	if root.Left == nil && root.Right == nil {
		return sum == targetSum
	}

	var left, right bool

	if root.Left != nil {
		left = dfs(root.Left, targetSum, sum)
	}

	if root.Right != nil {
		right = dfs(root.Right, targetSum, sum)
	}

	return left || right
}

func TestHasPathSum(t *testing.T) {
	node3 := TreeNode{3, nil, nil}
	node2 := TreeNode{2, &node3, nil}
	tree := TreeNode{Val: 1, Left: nil, Right: &node2}

	assert.False(t, hasPathSum(&tree, 5))
	assert.True(t, hasPathSum(&tree, 6))
}