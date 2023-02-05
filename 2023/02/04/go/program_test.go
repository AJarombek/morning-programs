/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 2/4/2023
 */

package _go

import "testing"

func TestAddDigits(t *testing.T) {
	if addDigits(38) != 2 {
		t.Errorf(`addDigits(38) != 2`)
	}

	if addDigits(0) != 0 {
		t.Errorf(`addDigits(0) != 0`)
	}
}

func TestMissingNumber(t *testing.T) {
	if missingNumber([]int{3, 0, 1}) != 2 {
		t.Errorf(`missingNumber([3, 0, 1) != 2`)
	}

	if missingNumber([]int{0, 1}) != 2 {
		t.Errorf(`missingNumber([0, 1) != 2`)
	}
}
