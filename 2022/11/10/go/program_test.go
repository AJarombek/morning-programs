/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 11/10/2022
 */

package _go

import "testing"

func TestIsPalindrome(t *testing.T) {
	list := ListNode{1, &ListNode{2, nil}}
	if isPalindrome(&list) {
		t.Errorf(`isPalindrome([1, 2]) != false`)
	}

	list = ListNode{1, &ListNode{2, &ListNode{2, &ListNode{1, nil}}}}
	if !isPalindrome(&list) {
		t.Errorf(`isPalindrome([1, 2, 2, 1]) != true`)
	}
}
