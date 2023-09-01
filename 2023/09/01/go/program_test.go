/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 9/1/2023
 */

package _go

import (
	"testing"
)

func TestMyHashSet(t *testing.T) {
	obj := Constructor()

	// Test the Put method
	obj.Put(1, 2)
	if obj.Get(1) != 2 {
		t.Errorf("Expected key 1 to have a value of 2, but it does not.")
	}

	// Test the Remove method
	obj.Remove(1)
	if obj.Get(1) != -1 {
		t.Errorf("Expected key 1 to be removed, but it still returns a positive value.")
	}
}
