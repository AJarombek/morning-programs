/**
 * https://leetcode.com/problems/same-tree/
 * Author: Andrew Jarombek
 * Date: 6/5/2022
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

func isSameTree(p *TreeNode, q *TreeNode) bool {
	if p == nil && q == nil {
		return true
	}

	if p == nil || q == nil || p.Val != q.Val {
		return false
	}

	return isSameTree(p.Left, q.Left) && isSameTree(p.Right, q.Right)
}

func TestSameTree(t *testing.T) {
	node3 := TreeNode{3, nil, nil}
	node2 := TreeNode{2, &node3, nil}
	tree1 := TreeNode{Val: 1, Left: nil, Right: &node2}

	node4 := TreeNode{3, nil, nil}
	node5 := TreeNode{2, &node4, nil}
	tree2 := TreeNode{Val: 1, Left: nil, Right: &node5}

	assert.True(t, isSameTree(&tree1, &tree2))
}