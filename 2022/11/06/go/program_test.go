/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 11/6/2022
 */

package _go

import "testing"

func TestStack(t *testing.T) {
	stack := Constructor()
	stack.Push(1)

	if stack.Top() != 1 {
		t.Errorf(`Top() != 1`)
	}

	if stack.Pop() != 1 {
		t.Errorf(`Pop() != 1`)
	}

	if !stack.Empty() {
		t.Errorf(`Empty() != true`)
	}
}
