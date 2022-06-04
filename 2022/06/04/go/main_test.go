/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 * Author: Andrew Jarombek
 * Date: 6/4/2022
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

func inorderTraversal(root *TreeNode) []int {
	result := make([]int, 0)
	return dfs(root, result)
}

func dfs(node *TreeNode, result []int) []int {
	if node == nil {
		return result
	}

	result = dfs(node.Left, result)
	result = append(result, node.Val)
	result = dfs(node.Right, result)

	return result
}

func TestInorderTraversal(t *testing.T) {
	node3 := TreeNode{3, nil, nil}
	node2 := TreeNode{2, &node3, nil}
	tree := TreeNode{Val: 1, Left: nil, Right: &node2}
	result := inorderTraversal(&tree)

	assert.Equal(t, 1, result[0])
	assert.Equal(t, 3, result[1])
	assert.Equal(t, 2, result[2])
}