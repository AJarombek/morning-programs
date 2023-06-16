/**
 * https://leetcode.com/problems/sum-of-left-leaves/
 * Author: Andrew Jarombek
 * Date: 6/16/2023
 */

package _go

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func sumOfLeftLeaves(root *TreeNode) int {
	return dfs(root, false)
}

func dfs(root *TreeNode, left bool) int {
	if root == nil {
		return 0
	}

	if root.Left == nil && root.Right == nil && left {
		return root.Val
	}

	return dfs(root.Left, true) + dfs(root.Right, false)
}
