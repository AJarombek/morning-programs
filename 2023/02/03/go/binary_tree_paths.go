/**
 * https://leetcode.com/problems/binary-tree-paths/
 * Author: Andrew Jarombek
 * Date: 2/3/2023
 */

package _go

import "strconv"

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func binaryTreePaths(root *TreeNode) []string {
	var result []string
	dfs(root, "", &result)
	return result
}

func dfs(node *TreeNode, path string, result *[]string) {
	if node.Left == nil && node.Right == nil {
		if len(path) > 0 {
			path += "->"
		}
		*result = append(*result, path+strconv.Itoa(node.Val))
		return
	}

	if len(path) > 0 {
		path = path + "->"
	}

	if node.Left != nil {
		dfs(node.Left, path+strconv.Itoa(node.Val), result)
	}

	if node.Right != nil {
		dfs(node.Right, path+strconv.Itoa(node.Val), result)
	}
}
