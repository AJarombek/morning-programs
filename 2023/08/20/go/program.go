/**
 * https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
 * Author: Andrew Jarombek
 * Date: 8/20/2023
 */

package _go

type Node struct {
	Val      int
	Children []*Node
}

func maxDepth(root *Node) int {
	if root == nil {
		return 0
	}

	nodes := []*Node{root}
	result := 0

	for len(nodes) > 0 {
		result++
		var nextNodes []*Node

		for _, node := range nodes {
			if node != nil {
				nextNodes = append(nextNodes, node.Children...)
			}
		}

		nodes = nextNodes
	}

	return result
}
