/**
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 * Author: Andrew Jarombek
 * Date: 6/28/2022
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

func getIntersectionNode(headA, headB *ListNode) *ListNode {
	a := 0
	b := 0

	nodeA := headA
	for nodeA != nil {
		a++
		nodeA = nodeA.Next
	}

	nodeB := headB
	for nodeB != nil {
		b++
		nodeB = nodeB.Next
	}

	var aSkip int
	var bSkip int

	if a > b {
		aSkip = a - b
		bSkip = 0
	} else {
		aSkip = 0
		bSkip = b - a
	}

	for i := 0; i < aSkip; i++ {
		headA = headA.Next
	}

	for i := 0; i < bSkip; i++ {
		headB = headB.Next
	}

	for headA != nil {
		if headA == headB {
			return headB
		}

		headA = headA.Next
		headB = headB.Next
	}

	return nil
}

func Test(t *testing.T) {
	a := ListNode{0, &ListNode{1, nil}}
	b := ListNode{0, &ListNode{1, nil}}
	assert.Nil(t, getIntersectionNode(&a, &b))

	b = ListNode{-1, &a}
	assert.NotNil(t, getIntersectionNode(&a, &b))
	assert.Equal(t, &a, getIntersectionNode(&a, &b))
}