/**
 * https://leetcode.com/problems/set-mismatch/
 * Author: Andrew Jarombek
 * Date: 8/1/2023
 */

package _go

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func findTarget(root *TreeNode, k int) bool {
	values := make(map[int]struct{})
	return dfs(root, k, &values)
}

func dfs(root *TreeNode, k int, values *map[int]struct{}) bool {
	if root == nil {
		return false
	}

	if _, ok := (*values)[k-root.Val]; ok {
		return true
	} else {
		(*values)[root.Val] = struct{}{}
	}

	return dfs(root.Left, k, values) || dfs(root.Right, k, values)
}
