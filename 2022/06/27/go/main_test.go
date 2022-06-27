/**
 * https://leetcode.com/problems/binary-tree-postorder-traversal/
 * Author: Andrew Jarombek
 * Date: 6/27/2022
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

func postorderTraversal(root *TreeNode) []int {
	if root == nil {
		return nil
	}

	return dfs(root, []int{})
}

func dfs(node *TreeNode, result []int) []int {
	if node.Left != nil {
		result = dfs(node.Left, result)
	}

	if node.Right != nil {
		result = dfs(node.Right, result)
	}

	return append(result, node.Val)
}

func Test(t *testing.T) {
	node3 := TreeNode{3, nil, nil}
	node2 := TreeNode{2, &node3, nil}
	tree := TreeNode{Val: 1, Left: nil, Right: &node2}

	result := postorderTraversal(&tree)
	assert.Equal(t, 3, result[0])
	assert.Equal(t, 2, result[1])
	assert.Equal(t, 1, result[2])
}