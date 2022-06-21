/**
 * https://leetcode.com/problems/linked-list-cycle/
 * Author: Andrew Jarombek
 * Date: 6/20/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

type ListNode struct {
	Val int
	Next *ListNode
}

func hasCycle(head *ListNode) bool {
	if head == nil {
		return false
	}

	slow := head
	fast := head.Next

	for fast != nil {
		if slow == fast {
			return true
		}

		slow = slow.Next
		fast = fast.Next

		if fast == nil {
			return false
		}

		fast = fast.Next
	}

	return false
}

func TestLinkedListCycle(t *testing.T) {
	node4 := ListNode{Val: -4, Next: nil}
	node3 := ListNode{Val: 0, Next: &node4}
	node2 := ListNode{Val: 2, Next: &node3}
	head := ListNode{Val: 3, Next: &node2}

	assert.False(t, hasCycle(&head))

	node4.Next = &node2

	assert.True(t, hasCycle(&head))
}