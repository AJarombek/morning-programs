/**
 * https://leetcode.com/problems/binary-tree-tilt/
 * Author: Andrew Jarombek
 * Date: 7/17/2023
 */

package _go

import "math"

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func findTilt(root *TreeNode) int {
	if root == nil {
		return 0
	}

	result := 0

	dfs(root, &result)
	return result
}

func dfs(root *TreeNode, result *int) int {
	if root == nil {
		return 0
	}

	left := dfs(root.Left, result)
	right := dfs(root.Right, result)

	*result += int(math.Abs(float64(left - right)))

	return left + right + root.Val
}
