/**
 * https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 * Author: Andrew Jarombek
 * Date: 8/21/2023
 */

package _go

type Node struct {
	Val      int
	Children []*Node
}

func preorder(root *Node) []int {
	if root == nil {
		return nil
	}

	var result []int

	dfs(root, &result)
	return result
}

func dfs(node *Node, result *[]int) {
	*result = append(*result, node.Val)

	for _, child := range node.Children {
		dfs(child, result)
	}
}
