/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 11/9/2022
 */

package _go

import "testing"

func TestPowerOfTwo(t *testing.T) {
	if !isPowerOfTwo(1) {
		t.Errorf(`isPowerOfTwo(1) != true`)
	}

	if !isPowerOfTwo(16) {
		t.Errorf(`isPowerOfTwo(16) != true`)
	}

	if isPowerOfTwo(3) {
		t.Errorf(`isPowerOfTwo(3) != false`)
	}
}

func TestQueue(t *testing.T) {
	queue := Constructor()
	queue.Push(1)
	queue.Push(2)

	if queue.Pop() != 1 {
		t.Errorf(`Top() != 1`)
	}

	if queue.Peek() != 2 {
		t.Errorf(`Peek() != 2`)
	}

	if queue.Empty() {
		t.Errorf(`Empty() != false`)
	}
}
