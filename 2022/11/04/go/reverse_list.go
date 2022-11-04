/**
 * https://leetcode.com/problems/reverse-linked-list/
 * Author: Andrew Jarombek
 * Date: 11/4/2022
 */

package _go

type ListNode struct {
	Val  int
	Next *ListNode
}

func reverseList(head *ListNode) *ListNode {
	var result *ListNode = nil
	current := head

	for current != nil {
		node := current
		current = current.Next
		node.Next = result
		result = node
	}

	return result
}
