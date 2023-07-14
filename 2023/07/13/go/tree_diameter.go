/**
 * https://leetcode.com/problems/diameter-of-binary-tree/
 * Author: Andrew Jarombek
 * Date: 7/13/2023
 */

package _go

import "math"

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func diameterOfBinaryTree(root *TreeNode) int {
	left, right := dfs(root)
	return left + right
}

func dfs(root *TreeNode) (int, int) {
	left := 0
	right := 0

	if root.Left != nil {
		l, r := dfs(root.Left)
		left = int(1 + math.Max(float64(l), float64(r)))
	}

	if root.Right != nil {
		l, r := dfs(root.Right)
		right = int(1 + math.Max(float64(l), float64(r)))
	}

	return left, right
}

// Attempt #2

func diameterOfBinaryTreeV2(root *TreeNode) int {
	if root == nil {
		return 0
	}

	maxDiameter := 0
	_ = dfsV2(root, &maxDiameter)
	return maxDiameter
}

func dfsV2(root *TreeNode, maxDiameter *int) int {
	if root == nil {
		return 0
	}

	leftHeight := dfsV2(root.Left, maxDiameter)
	rightHeight := dfsV2(root.Right, maxDiameter)

	// Update the maximum diameter if necessary
	*maxDiameter = int(math.Max(float64(*maxDiameter), float64(leftHeight+rightHeight)))

	// Return the maximum height between left and right subtrees
	return int(math.Max(float64(leftHeight), float64(rightHeight))) + 1
}
