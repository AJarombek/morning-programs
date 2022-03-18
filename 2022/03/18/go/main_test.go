/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * Author: Andrew Jarombek
 * Date: 3/18/2022
 */

// If you need me to make the first move, let me know.  If you are feeling brave,
// send me a text saying hello (2035508738).  But if you are doing all this with no
// intention of speaking to me, please stop.  My heart has missed you far too long
// for that and doesn't deserve more pain.

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

type ListNode struct {
	Val int
	Next *ListNode
}

func mergeTwoLists(list1 *ListNode, list2 *ListNode) *ListNode {
	var head *ListNode = nil
	var current *ListNode = nil

	for list1 != nil || list2 != nil {
		node := ListNode{Val: 0, Next: nil}

		if list1 == nil {
			node.Val = list2.Val
			list2 = list2.Next
		} else if list2 == nil {
			node.Val = list1.Val
			list1 = list1.Next
		} else if list1.Val > list2.Val {
			node.Val = list2.Val
			list2 = list2.Next
		} else {
			node.Val = list1.Val
			list1 = list1.Next
		}

		if head == nil {
			head = &node
			current = head
		} else {
			current.Next = &node
			current = current.Next
		}
	}

	return head
}

func TestMergeTwoLists(t *testing.T) {
	list1 := ListNode{Val: 3, Next: &ListNode{1, nil}}
	list2 := ListNode{Val: 2, Next: &ListNode{6, nil}}
	result := mergeTwoLists(&list1, &list2)
	assert.Equal(t, result.Val, 2)
	assert.Equal(t, result.Next.Val, 3)
	assert.Equal(t, result.Next.Next.Val, 1)
	assert.Equal(t, result.Next.Next.Next.Val, 6)
}