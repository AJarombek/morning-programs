/**
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 * Author: Andrew Jarombek
 * Date: 6/21/2022
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

func preorderTraversal(root *TreeNode) []int {
	if root == nil {
		return []int {}
	}

	return dfs(root, []int {})
}

func dfs(node *TreeNode, result []int) []int {
	result = append(result, node.Val)

	if node.Left != nil {
		result = dfs(node.Left, result)
	}

	if node.Right != nil {
		result = dfs(node.Right, result)
	}

	return result
}

func TestPreOrderTraversal(t *testing.T) {
	node3 := TreeNode{3, nil, nil}
	node2 := TreeNode{2, &node3, nil}
	tree := TreeNode{Val: 1, Left: nil, Right: &node2}

	result := preorderTraversal(&tree)
	assert.Equal(t, 1, result[0])
	assert.Equal(t, 2, result[1])
	assert.Equal(t, 3, result[2])
}