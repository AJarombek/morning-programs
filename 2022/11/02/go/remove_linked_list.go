/**
 * https://leetcode.com/problems/remove-linked-list-elements/
 * Author: Andrew Jarombek
 * Date: 11/2/2022
 */

package _go

type ListNode struct {
	Val  int
	Next *ListNode
}

func removeElements(head *ListNode, val int) *ListNode {
	for head != nil && head.Val == val {
		head = head.Next
	}

	node := head

	for node.Next != nil {
		if node.Next.Val == val {
			node.Next = node.Next.Next
		} else {
			node = node.Next
		}
	}

	return head
}
