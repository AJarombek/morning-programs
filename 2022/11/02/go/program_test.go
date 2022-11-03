/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 11/2/2022
 */

package _go

import "testing"

func TestRemoveLinkedList(t *testing.T) {
	linkedList := ListNode{1, &ListNode{2, &ListNode{6, &ListNode{3, &ListNode{4, &ListNode{5, &ListNode{6, nil}}}}}}}
	result := removeElements(&linkedList, 6)

	if result.Val != 1 {
		t.Errorf(`Element #1 != 1`)
	}

	if result.Next.Val != 2 {
		t.Errorf(`Element #2 != 2`)
	}

	if result.Next.Next.Val != 3 {
		t.Errorf(`Element #3 != 3`)
	}

	if result.Next.Next.Next.Val != 4 {
		t.Errorf(`Element #4 != 4`)
	}

	if result.Next.Next.Next.Next.Val != 5 {
		t.Errorf(`Element #5 != 5`)
	}

	if result.Next.Next.Next.Next.Next != nil {
		t.Errorf(`Element #6 != nil`)
	}
}
