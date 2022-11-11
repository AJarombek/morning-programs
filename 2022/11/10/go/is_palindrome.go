/**
 * https://leetcode.com/problems/palindrome-linked-list/
 * Author: Andrew Jarombek
 * Date: 11/10/2022
 */

package _go

type ListNode struct {
	Val  int
	Next *ListNode
}

func isPalindrome(head *ListNode) bool {
	if head == nil || head.Next == nil {
		return true
	}

	fast := head
	slow := head

	for fast != nil && fast.Next != nil {
		slow = slow.Next
		fast = fast.Next.Next
	}

	node := slow
	var half *ListNode

	for node != nil {
		next := node.Next
		node.Next = half
		half = node
		node = next
	}

	for head != nil && half != nil {
		if head.Val != half.Val {
			return false
		}

		head = head.Next
		half = half.Next
	}

	return true
}
