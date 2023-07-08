/**
 * https://leetcode.com/problems/find-mode-in-binary-search-tree/
 * Author: Andrew Jarombek
 * Date: 7/7/2023
 */

package _go

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func findMode(root *TreeNode) []int {
	// Call dfs to perform in-order traversal
	values := dfs(root)

	// Count the frequencies of each value
	counts := make(map[int]int)
	for _, val := range values {
		counts[val]++
	}

	// Find the maximum frequency
	maxFreq := 0
	for _, count := range counts {
		if count > maxFreq {
			maxFreq = count
		}
	}

	// Collect values with maximum frequency
	result := make([]int, 0)
	for val, count := range counts {
		if count == maxFreq {
			result = append(result, val)
		}
	}

	return result
}

// Depth-First Search (DFS) to perform in-order traversal
func dfs(root *TreeNode) []int {
	if root == nil {
		return []int{}
	}

	left := dfs(root.Left)
	right := dfs(root.Right)

	return append(append(left, root.Val), right...)
}
