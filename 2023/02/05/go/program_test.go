/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 2/5/2023
 */

package _go

import "testing"

func TestMoveZeroes(t *testing.T) {
	list := []int{0, 1, 0, 3, 12}
	moveZeroes(list)

	if list[0] != 1 {
		t.Errorf(`list[0] != 1`)
	}
	if list[1] != 3 {
		t.Errorf(`list[1] != 3`)
	}
	if list[2] != 12 {
		t.Errorf(`list[2] != 12`)
	}
	if list[3] != 0 {
		t.Errorf(`list[3] != 0`)
	}
	if list[4] != 0 {
		t.Errorf(`list[4] != 0`)
	}
}
