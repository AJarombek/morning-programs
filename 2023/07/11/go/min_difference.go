/**
 * https://leetcode.com/problems/detect-capital/
 * Author: Andrew Jarombek
 * Date: 7/11/2023
 */

package _go

import "math"

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func getMinimumDifference(root *TreeNode) int {
	result := math.MaxInt
	dfs(root, nil, &result)
	return result
}

func dfs(root *TreeNode, prev *TreeNode, min *int) *TreeNode {
	if root.Left != nil {
		prev = dfs(root.Left, prev, min)
	}

	if prev != nil {
		diff := root.Val - prev.Val

		if diff < *min {
			*min = diff
		}
	}

	prev = root

	if root.Right != nil {
		prev = dfs(root.Right, prev, min)
	}

	return prev
}
