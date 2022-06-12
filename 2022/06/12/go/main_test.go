/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 * Author: Andrew Jarombek
 * Date: 6/12/2022
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

func minDepth(root *TreeNode) int {
	if root == nil {
		return 0
	}

	return dfs(root, 1)
}

func dfs(node *TreeNode, depth int) int {
	if node.Left == nil && node.Right == nil {
		return depth
	}

	left := 0
	right := 0

	if node.Left != nil {
		left = dfs(node.Left, depth + 1)
	}

	if node.Right != nil {
		right = dfs(node.Right, depth + 1)
	}

	if left == 0 || right == 0 {
		if left > right {
			return left
		} else {
			return right
		}
	} else {
		if left < right {
			return left
		} else {
			return right
		}
	}
}

func TestMinDepth(t *testing.T) {
	node3 := TreeNode{3, nil, nil}
	node2 := TreeNode{2, &node3, nil}
	tree := TreeNode{Val: 1, Left: nil, Right: &node2}

	assert.Equal(t, 3, minDepth(&tree))

	node3 = TreeNode{3, nil, nil}
	node2 = TreeNode{2, nil, nil}
	tree = TreeNode{Val: 1, Left: &node3, Right: &node2}

	assert.Equal(t, 2, minDepth(&tree))
}