/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/31/2023
 */

package _go

import (
	"testing"
)

func TestMyHashSet(t *testing.T) {
	obj := Constructor()

	// Test the Add method
	obj.Add(1)
	if !obj.Contains(1) {
		t.Errorf("Expected key 1 to be present after adding, but it's not.")
	}

	// Test the Remove method
	obj.Remove(1)
	if obj.Contains(1) {
		t.Errorf("Expected key 1 to be removed, but it's still present.")
	}

	// Test the Contains method
	if obj.Contains(2) {
		t.Errorf("Expected key 2 to be absent, but it's present.")
	}
}
