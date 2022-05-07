/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * Author: Andrew Jarombek
 * Date: 5/6/2022
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

func deleteDuplicates(head *ListNode) *ListNode {
	if head == nil {
		return nil
	}

	result := head
	current := result

	for current.Next != nil {
		if current.Val == current.Next.Val {
			current.Next = current.Next.Next
		} else {
			current = current.Next
		}
	}

	return result
}

func TestDeleteDuplicates(t *testing.T) {
	head := ListNode{Val: 1, Next: &ListNode{Val: 1, Next: &ListNode{Val: 2, Next: &ListNode{Val: 3, Next: nil}}}}
	result := deleteDuplicates(&head)
	assert.Equal(t, 1, result.Val)
	assert.Equal(t, 2, result.Next.Val)
	assert.Equal(t, 3, result.Next.Next.Val)
}