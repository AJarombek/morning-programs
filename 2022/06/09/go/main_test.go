/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * Author: Andrew Jarombek
 * Date: 6/9/2022
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

func maxDepth(root *TreeNode) int {
	if root == nil {
		return 0
	}

	return dfs(root, 1)
}

func dfs(node *TreeNode, depth int) int {
	var left, right int

	if node.Left != nil {
		left = dfs(node.Left, depth + 1)
	}

	if node.Right != nil {
		right = dfs(node.Right, depth + 1)
	}

	result := depth

	if left > result {
		result = left
	}

	if right > result {
		result = right
	}

	return result
}

func TestMaxDepth(t *testing.T) {
	node3 := TreeNode{3, nil, nil}
	node2 := TreeNode{2, &node3, nil}
	tree := TreeNode{Val: 1, Left: nil, Right: &node2}

	assert.Equal(t, 3, maxDepth(&tree))
}