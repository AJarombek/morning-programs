/**
 * https://leetcode.com/problems/minimum-distance-between-bst-nodes/
 * Author: Andrew Jarombek
 * Date: 8/26/2023
 */

package _go

import "math"

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func minDiffInBST(root *TreeNode) int {
	prev := -1
	return dfs(root, &prev)
}

func dfs(node *TreeNode, prev *int) int {
	result := math.MaxInt

	if node.Left != nil {
		result = dfs(node.Left, prev)
	}

	if *prev != -1 {
		value := node.Val - *prev
		result = int(math.Min(float64(value), float64(result)))
	}

	*prev = node.Val

	if node.Right != nil {
		right := dfs(node.Right, prev)
		result = int(math.Min(float64(right), float64(result)))
	}

	return result
}
