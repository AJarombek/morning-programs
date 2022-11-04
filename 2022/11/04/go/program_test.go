/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 11/4/2022
 */

package _go

import "testing"

func TestReverseList(t *testing.T) {
	list := ListNode{1, &ListNode{2, &ListNode{3, &ListNode{4, &ListNode{5, nil}}}}}
	reversedList := reverseList(&list)

	for i := 5; i > 0; i-- {
		if reversedList.Val != i {
			t.Errorf(`ListNode.Val != %d`, i)
		}

		reversedList = reversedList.Next
	}

	if reversedList != nil {
		t.Errorf(`ListNode != nil`)
	}
}
